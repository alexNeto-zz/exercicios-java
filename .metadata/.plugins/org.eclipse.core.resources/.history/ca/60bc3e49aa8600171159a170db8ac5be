package lista_2;

import java.util.Scanner;

public class Aplicacao {

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
