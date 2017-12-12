package lista_10.dependencias.exercicio_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Agenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList<Contato> contatos;
	private String arquivo = "agendaThread.ser";

	public Agenda() {
		if (!ler())
			contatos = new ArrayList<>();
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
			contatos = (ArrayList<Contato>) objeto;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public synchronized Contato get(int id) {

		Contato contato = null;
		try {
			contato = contatos.get(id);
		} catch (NoSuchElementException e) {
		}
		return contato;
	}

	public synchronized ArrayList<Contato> getAll() {

		ArrayList<Contato> contato = null;
		try {
			contato = contatos;
		} catch (NoSuchElementException e) {
		}
		return contato;
	}

	public synchronized void add(Contato contato) {
		contatos.add(contato);
	}

	public synchronized void modify(int id, Contato contato) {
		contatos.set(id, contato);
	}

	public synchronized void remove(int id) {
		contatos.remove(id);
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
