package lista_5;


public class Exercicio_2 {
	public static void exercicio(int tamanho) {
		if(tamanho > 0 && tamanho < 21) {
			for(int i = 0; i < tamanho; i++) {
				for(int j = 0; j < tamanho; j++) {
					if((j == 0 || j == tamanho - 1) || (i == 0 || i == tamanho - 1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("desculpa, nosso sistema não é capaz disso");
		}
	}
}
