package lista_2;

public class Exercicio_2 {
	
	public static void exercicio(int numero1, int numero2) {
		
		int soma;
		System.out.printf("\nA soma é %d\n", soma = (numero1 + numero2));
		System.out.printf("A média é %f\n", (double)(soma / 2));
		System.out.println(((numero1 < numero2) ? numero1 + 
				", " + numero2 : numero2 +", "+ numero1));
	}

}
