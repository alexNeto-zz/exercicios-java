package lista_1;

public class Exercicio_3 {
	
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.println("Digite cinco n�meros: ");
	int[] numeros = new int[5];
	for(int i = 0; i < 5; i++)
		int numero[i] = input.nextInt();
	
	numeros = numeros.sort();
	
	System.out.printf("O menor n�mero �: %d e o maior � %d", numeros[0], numeros[4]);
}
