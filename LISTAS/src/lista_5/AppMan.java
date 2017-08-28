package lista_5;

import java.util.Iterator;
import java.util.Scanner;

import lista_5.dependencias.*;

public class AppMan {
	private Agenda agenda = new Agenda();
	Scanner scanner = new Scanner(System.in);

	public AppMan() {

	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Cadastrar Professor");
		System.out.println("3 - Listar Todos");
		System.out.println("4 - Editar");
		System.out.println("5 - Deletar");
		System.out.println("6 - Sair");
		System.out.println();
	}

	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome: ");
		aluno.setNome(scanner.next());
		System.out.println("Digite o email: ");
		aluno.setEmail(scanner.next());
		System.out.println("Digite o telefone: ");
		aluno.setTelefone(scanner.next());
		System.out.println("Digite o número da matricula: ");
		aluno.setNumeroMatricula(scanner.next());
		return aluno;
	}

	public void cadastrarNovoAluno() {
		agenda.setAlunos(cadastrarAluno());
	}

	public Professor cadastrarProfessor() {
		Professor professor = new Professor();
		System.out.println("Digite o nome: ");
		professor.setNome(scanner.next());
		System.out.println("Digite o email: ");
		professor.setEmail(scanner.next());
		System.out.println("Digite o telefone: ");
		professor.setTelefone(scanner.next());
		System.out.println("Digite o número da matricula: ");
		professor.setQuantidadeHoraAula(scanner.next());
		return professor;
	}

	public void cadastrarNovoProfessor() {
		agenda.setProfessores(cadastrarProfessor());
	}

	public void imprimirNome(int tipo) {
		int j = 0;
		if (tipo == 1) {
			System.out.println("Lista de todos os Alunos:");
			Iterator<Aluno> iteAlu = agenda.getAlunos().iterator();
			while (iteAlu.hasNext()) {
				iteAlu.next();
				System.out.println((j + 1) + " - Nome: " + agenda.getAlunos().get(j).getNome());
				j++;
			}
		} else {
			System.out.println("Lista de todos os Professores");
			Iterator<Professor> itePro = agenda.getProfessor().iterator();
			while (itePro.hasNext()) {
				itePro.next();
				System.out.println((j + 1) + " - Nome: " + agenda.getAlunos().get(j).getNome());
				j++;
			}
		}
	}

	public void listarTodos() {
		agenda.listarTodos();
	}

	public void editar() {
		System.out.println("Deseja editar\n1 - Aluno\n2 - Professor");
		int tipo = scanner.nextInt();
		imprimirNome(tipo);
		System.out.println("Qual cliente deseja editar: ");
		int edit = scanner.nextInt();
		if (tipo == 1) {
			agenda.getAlunos().set(edit - 1, cadastrarAluno());
		} else {
			agenda.getProfessor().set(edit - 1, cadastrarProfessor());
		}
	}

	public void deletar() {
		System.out.println("Deseja deletar\n1 - Aluno\n2 - Professor");
		int tipo = scanner.nextInt();
		imprimirNome(tipo);
		System.out.println("Qual cliente deseja editar: ");
		int edit = scanner.nextInt();
		if (tipo == 1) {
			agenda.getAlunos().remove(edit - 1);
		} else {
			agenda.getProfessor().remove(edit - 1);
		}
	}
}
