package lista_5;

public class Exercicio_3 {

	public static void exercicio(double[] numeros) {
		for(int i = 0; i < numeros.length; i++){
			for(int j = 0; j < numeros.length - 1; j++){
				if(numeros[j] > numeros[j + 1]){
					double temp = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Math.pow(numeros[i], 2);
		}
		
		if(Math.sqrt(numeros[2]) == Math.sqrt(numeros[1] + numeros[0])) {
			System.out.println("É possível ter um triângulo retângulo com essas medidas");
		}
		else {
			System.out.println("Não é possível ter um triângulo retângulo com essas medidas");
		}
		
	}
}
