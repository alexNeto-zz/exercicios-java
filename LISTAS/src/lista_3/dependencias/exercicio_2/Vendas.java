package lista_3.dependencias.exercicio_2;

public class Vendas {

	private int[] id;
	private double totalPreco = 0;
	private int totalItens = 0;
	private double[] porcentagem;
	private double[] preco = { 1.00, 2.98, 9.98, 4.49, 6.87 };

	public Vendas() {
		this.porcentagem = new double[5];
		id = new int[5];
	}

	public void compraRealizada(int id, int quantidade) {
		this.id[id] += quantidade;
		this.totalItens += quantidade;
		System.out.println("total quantidade produto " + (id + 1) + ": " + totalItens);
		this.totalPreco += preco[id] * quantidade;
		porcentagem();
	}

	public void porcentagem() {
		for (int i = 0; i < 5; i++) {
			this.porcentagem[i] = (100 * this.id[i]) / this.totalItens;
		}
	}

	public double getTotalPreco() {
		return totalPreco;
	}

	public double[] getProcentagem() {
		return this.porcentagem;
	}
}
