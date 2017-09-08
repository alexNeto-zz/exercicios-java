package lista_5.dependencias;

import java.util.Scanner;

public class Menu {

	Scanner scanner = new Scanner(System.in);
	private Agenda agenda = new Agenda();

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Cadastrar Professor");
		System.out.println("3 - Listar Alunos");
		System.out.println("4 - Listar Professor");
		System.out.println("5 - Editar Aluno");
		System.out.println("6 - Editar Professor");
		System.out.println("7 - Deletar Aluno");
		System.out.println("8 - Deletar Professor");
		System.out.println("9 - Sair");
		System.out.println();
	}

	public void menuPrincipal() {

		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0:
				imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			case 1:
				agenda.cadastrarNovoAluno();
				opcao = 0;
				break;
			case 2:
				agenda.cadastrarNovoProfessor();
				opcao = 0;
				break;
			case 3:
				agenda.listarAluno();
				opcao = 0;
				break;
			case 4:
				agenda.listarProfessor();
				opcao = 0;
				break;
			case 5:
				agenda.editarAluno();
				opcao = 0;
				break;
			case 6:
				agenda.editarProfessor();
				opcao = 0;
				break;
			case 7:
				agenda.deletaAluno();
				opcao = 0;
				break;
			case 8:
				agenda.deletaProfessor();
				opcao = 0;
				break;
			case 9:
				sair = 1;
				System.out.println("\nAté mais!");
				break;
			default:
				imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}
	}
}
