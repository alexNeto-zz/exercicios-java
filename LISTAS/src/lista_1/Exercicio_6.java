package lista_1;

import java.util.Scanner;

public class Exercicio_6 {

	public static void exercicio() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean executar = true;
		while (executar) {
			System.out.println("Calculadora básica. Para fazer cálculos com 2 números");
			System.out.println("Digite a opção que você deseja: ");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			int opcao = input.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o primeiro número");
				int numero1 = input.nextInt();
				System.out.println("Digite o segundo número");
				int numero2 = input.nextInt();
				System.out.printf("Resultado: %d\n", numero1 + numero2);
			}
			if (opcao == 2) {
				System.out.println("Digite o primeiro número");
				int numero1 = input.nextInt();
				System.out.println("Digite o segundo número");
				int numero2 = input.nextInt();
				System.out.printf("Resultado: %d\n", numero1 - numero2);
			}
			if (opcao == 3) {
				System.out.println("Digite o primeiro número");
				int numero1 = input.nextInt();
				System.out.println("Digite o segundo número");
				int numero2 = input.nextInt();
				System.out.printf("Resultado: %d\n", numero1 * numero2);
			}
			if (opcao == 4) {
				System.out.println("Digite o primeiro número");
				int numero1 = input.nextInt();
				System.out.println("Digite o segundo número");
				int numero2 = input.nextInt();
				if(numero2 != 0)
					System.out.printf("Resultado: %d\n", (double)(numero1 / numero2));
				else
					System.out.println("ah ah ah!, lembrai-vos-ei, não dividirás por zero");
			}
			if (opcao == 5) {
				executar = false;
			}
		}

	}

}
