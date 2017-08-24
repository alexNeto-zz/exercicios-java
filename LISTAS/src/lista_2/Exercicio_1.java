package lista_2;

public class Exercicio_1 {

	public static void exercicio(int numero1, int numero2) {

		System.out.printf("\nA soma é %d\n", numero1 + numero2);
		System.out.printf("A subtração é %d\n", numero1 - numero2);
		System.out.printf("A multiplicação é %d\n", numero1 * numero2);
		System.out.println((numero2 == 0) ? "Divisão por 0 não é permitido" : "A divisão é %.2f" + (numero1 / (double)numero2));

	}
}
