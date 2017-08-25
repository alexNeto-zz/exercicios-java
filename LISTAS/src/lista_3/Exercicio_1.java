package lista_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exercicio_1 {

	public static void exercicio() {
		Aplicacao.aplicacao();
	}
}

class Aplicacao {

	private static Scanner scanner;

	public static void aplicacao() {

		scanner = new Scanner(System.in);
		System.out.println("Entre um tipo de permanência\n" + "1 - Array\n2 - Vector\n3 - ArrayList");
		int appPer = scanner.nextInt();
		AgendaTelefonica agenda = new AgendaTelefonica(appPer);
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0:
				agenda.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			case 1:
				agenda.imprimirPessoas();
				opcao = 0;
				break;
			case 2:
				agenda.cadastrarPessoa();
				opcao = 0;
				break;
			case 3:
				sair = 1;
				System.out.println("\nAté mais!");
				break;
			default:
				agenda.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}
	}

}

class Pessoa {

	private String nome;
	private String telefone;
	private String email;

	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class AgendaTelefonica {

	private static final int J = 5;
	private Pessoa[] pessoas;
	private Vector<Pessoa> pessoasVec;
	private ArrayList<Pessoa> pessoasArrList;
	private Scanner scanner;
	private int appPer = 1;
	private int i = 0;

	public AgendaTelefonica(int appPer) {
		this.appPer = appPer;
		scanner = new Scanner(System.in);
		if (appPer == 1) {
			pessoas = new Pessoa[5];
		} else if (appPer == 2) {
			pessoasVec = new Vector<Pessoa>(5);
		} else if (appPer == 3) {
			pessoasArrList = new ArrayList<Pessoa>();
		} else {
			System.out.println("oh man, algo de errado aconteceu - AgendaTelefonica()");
		}
	}

	@SuppressWarnings("unused")
	public void cadastrarPessoa() {
		for (; this.i < J; this.i++) {
			System.out.println("\n Insira um nome para a pessoa");
			String nome = scanner.next();
			System.out.println("\nInsira um telefone para a pessoa");
			String telefone = scanner.next();
			System.out.println("\nInsira um email para a pessoa");
			String email = scanner.next();
			Pessoa nova = new Pessoa(nome, telefone, email);
			permanencia(appPer, nova, this.i);
			System.out.println("\nNovo contato adicionado\n");
			break;
		}
	}

	public void permanencia(int appPer, Pessoa nova, int i) {
		if (appPer == 1) {
			pessoas[i] = nova;
		} else if (appPer == 2) {
			pessoasVec.addElement(nova);
		} else if (appPer == 3) {
			pessoasArrList.add(nova);
		} else {
			System.out.println("oh man, algo de errado aconteceu - permanencia()");
		}
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Listar contatos \n");
		System.out.println("2 - Incluir contatos \n");
		System.out.println("3 - Sair \n");
	}

	public void imprimirPessoas() {
		if (appPer == 1) {
			for (Pessoa pessoa : pessoas) {
				if (pessoa != null) {
					System.out.println("\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone()
							+ "\nEmail: " + pessoa.getEmail());
				}
			}
		} else if (appPer == 2) {
			int j = 0;
			Iterator<Pessoa> itePessVec = pessoasVec.iterator();
			while (itePessVec.hasNext()) {
				itePessVec.next();
				System.out.println("\nNome: " + pessoasVec.get(j).getNome() + "\nTelefone: "
						+ pessoasVec.get(j).getTelefone() + "\nEmail: " + pessoasVec.get(j).getEmail());
				j++;
			}
		} else if (appPer == 3) {
			int j = 0;
			Iterator<Pessoa> itePessArrList = pessoasArrList.iterator();
			while (itePessArrList.hasNext()) {
				itePessArrList.next();
				System.out.println("\nNome: " + pessoasArrList.get(j).getNome() + "\nTelefone: "
						+ pessoasArrList.get(j).getTelefone() + "\nEmail: " + pessoasArrList.get(j).getEmail());
				j++;
			}
		}
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
}
