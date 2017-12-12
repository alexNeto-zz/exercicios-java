package lista_11.dependencias.exercicio_1;

import java.io.*;
import java.util.*;

public class Agenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1645008654020329417L;
	public static Set<Contato> contatos;
	private String arquivo = "agendaThreadSet.ser";

	public Agenda() {
		if (!ler())
			contatos = new HashSet<>();
	}

	public boolean ler() {

		FileInputStream lerAquivos;
		try {
			lerAquivos = new FileInputStream(arquivo);
		} catch (FileNotFoundException e) {
			return false;
		}
		try (ObjectInputStream importarAgenda = new ObjectInputStream(lerAquivos)) {
			Object objeto = importarAgenda.readObject();
			contatos = (HashSet<Contato>) objeto;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public synchronized Contato get(String nome) {

		Contato contato = null;
		try {
			for (Iterator<Contato> it = contatos.iterator(); it.hasNext();) {
				Contato f = it.next();
				if (f.getNome().equals(new String(nome))) {
					contato = f;
				}
			}
		} catch (NoSuchElementException e) {
		}
		return contato;
	}

	public synchronized Set<Contato> getAll() {

		Set<Contato> contato = null;
		try {
			contato = contatos;
		} catch (NoSuchElementException e) {
		}
		return contato;
	}

	public synchronized void add(Contato contato) {
		contatos.add(contato);
	}

	public synchronized void remove(String nome) {
		for (Iterator<Contato> it = contatos.iterator(); it.hasNext();) {
			Contato f = it.next();
			if (f.getNome().equals(new String(nome))) {
				contatos.remove(f);
			}
		}
	}

	public void salvar() {
		try (FileOutputStream salvarAgenda = new FileOutputStream(arquivo);
				ObjectOutputStream salvaConteudo = new ObjectOutputStream(salvarAgenda)) {
			salvaConteudo.writeObject(contatos);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
