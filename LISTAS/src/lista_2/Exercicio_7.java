package lista_2;

public class Exercicio_7 {
	
	public static void exercicio(double horasTrabalhadas, double valorPorHora) {
		
		if(horasTrabalhadas < 40) {
			System.out.println("O salário é de R$:" + horasTrabalhadas * valorPorHora);
		}
		else {
			double valorBase = 40 * valorPorHora;
			double valorExtra = (horasTrabalhadas - 40) * (valorPorHora + (valorPorHora * 50/100));
			System.out.println("O salário é de R$:" + (valorBase + valorExtra));
		}

	}

}
