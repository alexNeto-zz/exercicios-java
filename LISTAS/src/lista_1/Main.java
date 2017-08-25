package lista_1;

public class Main {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		int escolha = 0;
		while (true && escolha != 9) {
			System.out.println("Escolha um Exercicio:");
			System.out.printf("1 - Exercicio 1\n" + "2 - Exercicio 2\n" + "3 - Exercicio 3\n" + "4 - Exercicio 4\n"
					+ "5 - Exercicio 5\n" + "6 - Exercicio 6\n" + "7 - Exercicio 7\n" + "8 - Exercicio 8\n"
					+ "9 - Sair\n");
			escolha = input.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("EXERCICIO 1");
				// Exercicio_1.exercicio();
				break;
			case 2:
				System.out.println("EXERCICIO 2");
				// Exercicio_2.exercicio();
				break;
			case 3:
				System.out.println("EXERCICIO 3");
				// Exercicio_3.exercicio();
				break;
			case 4:
				System.out.println("EXERCICIO 4");
				// Exercicio_4.exercicio(numero1, numero2);
				break;
			case 5:
				System.out.println("EXERCICIO 5");
				// Exercicio_5.exercicio();
				break;
			case 6:
				System.out.println("EXERCICIO 6");
				// Exercicio_6.exercicio();
				break;
			case 7:
				System.out.println("EXERCICIO 7");
				// Exercicio_7.exercicio();
				break;
			case 8:
				System.out.println("EXERCICIO 8");
				// Exercicio_8.exercicio();
				break;

			default:
				break;
			}
		}

	}

}
