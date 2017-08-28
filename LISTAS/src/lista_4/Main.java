package lista_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		AppMan app = new AppMan();
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0:
				app.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			case 1:
				app.cadastrarNovoAluno();
				opcao = 0;
				break;
			case 2:
				app.cadastrarNovoProfessor();
				opcao = 0;
				break;
			case 3:
				app.listarTodos();
				opcao = 0;
				break;
			case 4:
				app.editar();
				opcao = 0;
				break;
			case 5:
				app.deletar();
				opcao = 0;
				break;
			case 6:
				sair = 1;
				System.out.println("\nAté mais!");
				break;
			default:
				app.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}

	}
}
