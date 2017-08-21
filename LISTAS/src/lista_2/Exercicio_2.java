package lista_2;

public class Exercicio_2 {
	
	private static final int J = 5;

	public static void exercicio(int[] quantidade) {
			
		Vendas venda = new Vendas();
		
		for(int i = 0; i < J; i++) {
			venda.compraRealizada(i, quantidade[i]);
		}
		System.out.printf("Total: %.2f\n", venda.getTotalPreco());
		System.out.println("Sendo\n");
		double[] porcentagem = venda.getProcentagem();
		for(int i = 0; i < J; i++) {
			System.out.printf("%.2f%% - P%d\n", porcentagem[i], i + 1);
		}
	}

}

class Vendas {

	private int[] id;
	private double totalPreco = 0;
	private int totalItens = 0;
	private double[] porcentagem;
	private double[] preco = {1.00, 2.98, 9.98, 4.49, 6.87};

	public Vendas() {
		this.porcentagem = new double[5];
		id = new int[5];
	}

	public void compraRealizada(int id, int quantidade) {
		this.id[id] += quantidade;
		this.totalItens += quantidade;
		System.out.println(totalItens);
		this.totalPreco += preco[id];
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
