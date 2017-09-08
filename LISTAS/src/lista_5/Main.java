package lista_5;

import java.util.Scanner;

import lista_5.dependencias.Menu;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int escolha = 0;
		while (true && escolha != 4) {
			System.out.println("Escolha um Exercicio:");
			System.out.printf("1 - Agenda 1\n" + "2 - Exercicio 2\n" + "3 - Exercicio 3\n" + "4 - Sair\n");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("AGENDA");
				Menu menu = new Menu();
				menu.menuPrincipal();
				break;
			case 2:
				System.out.println("EXERCICIO 2");
				System.out.println("Digite o tamanho do quadrado (1-20):");
				Exercicio_2.exercicio(scanner.nextInt());
				break;
			case 3:
				System.out.println("EXERCICIO 3");
				System.out.println("Digite três números não nulos e positivos");
				double[] numeros = new double[3];
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = scanner.nextDouble();
				}
				Exercicio_3.exercicio(numeros);
				break;
			case 4:
				System.out.println("obrigado pela preferência");
				break;
			default:
				break;
			}
		}

	}

}
