package lista_1;

public class Exercicio_4 {

	public static void exercicio() {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero1 = input.nextInt();
		System.out.println("Digite outro número: ");
		int numero2 = input.nextInt();

		System.out.println((numero1 % numero2 == 0) ? "é divisivel" : "não é divisivel");
	}
}
