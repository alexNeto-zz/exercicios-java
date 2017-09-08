package lista_1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void exercicio() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero1 = input.nextInt();
		System.out.println("Digite outro número:");
		int numero2 = input.nextInt();

		if (numero1 < numero2) {
			System.out.println("numero1 < numero2");
		}
		else if (numero1 > numero2) {
			System.out.println("numero1 > numero2");
		}
		if (numero1 == numero2) {
			System.out.println("numero1 = numero2");
		}
		else if (numero1 != numero2) {
			System.out.println("numero1 != numero2");
		}
	}

}
