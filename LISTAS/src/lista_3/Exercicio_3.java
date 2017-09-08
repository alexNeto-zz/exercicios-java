package lista_3;

public class Exercicio_3 {

	public static void exercicio(String tempo) {

		Estacionamento cliente = new Estacionamento(tempo);
		cliente.imprimeTotal();
	}
}

class Estacionamento {

	private String tempo;
	private int horas;
	private int minutos;
	private double total;
	private double[] preco = { 2.00, 0.5 }; // {preço minimo, adicional}

	public Estacionamento(String tempo) {
		this.tempo = tempo;
		this.total = 0.0;
		parseToTempo(tempo);
	}

	public void parseToTempo(String tempo) {
		String horasString = "";
		String minutosString = "";
		for (int i = 0; i < 5; i++) {
			if (i < 2) {
				horasString += tempo.charAt(i);
			} else if (i > 2) {
				minutosString += tempo.charAt(i);
			}
		}
		this.horas = Integer.parseInt(horasString);
		this.minutos = Integer.parseInt(minutosString);
		calculaPreco(horas, minutos);
	}

	public void calculaPreco(int horas, int minutos) {
		if (horas >= 3 && minutos > 0) {
			this.total += preco[0];
			this.total += (preco[1] * (horas - preco[0]));
		} else {
			this.total = preco[0];
		}
	}

	public void imprimeTotal() {
		System.out.println("ESTACIONAMENTO");
		System.out.println("Tempo de Permanência: " + tempo);
		System.out.println("Total: R$" + total);
	}
}
