package lista_5;

import java.util.Scanner;

import lista_5.dependencias.Menu;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escola o exercicio:\n1 - Agenda\n2 - Exercicio 2\n3 - Exercicio 3");
		int escolha = scanner.nextInt();
		if (escolha == 1) {
			Menu.menuPrincipal();
		} else if (escolha == 2) {
			System.out.println("EXERCICIO 2");
			System.out.println("Digite o tamanho do quadrado (1-20):");
			Exercicio_2.exercicio(scanner.nextInt());
		} else if (escolha == 3) {
			System.out.println("EXERCICIO 3");
			System.out.println("Digite três números não nulos e positivos");
			double[] numeros = new double[3];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = scanner.nextDouble();				
			}
			Exercicio_3.exercicio(numeros);
		} else {
			System.out.println("não tem essa opção");
		}

	}

}
