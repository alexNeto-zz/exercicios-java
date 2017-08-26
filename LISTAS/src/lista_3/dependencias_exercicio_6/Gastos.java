package lista_3.dependencias_exercicio_6;

import java.time.LocalDate;

public class Gastos {
	private double[] meses = new double[13];
	private double total;
	private int mesAtual;

	public Gastos() {
		mesAtual = getMesAtual();
	}

	public Gastos(double[] meses) {
		mesAtual = getMesAtual();
		this.meses = meses;
	}

	public int getMesAtual() {
		LocalDate hoje = LocalDate.now();
		return hoje.getMonthValue() - 1;
	}

	public void adicionarGasto(double gasto) {
		meses[12] += gasto;
	}

	public void atualizaMes() {
		if (this.mesAtual != getMesAtual()) {
			meses[mesAtual] = meses[12];
			meses[12] = 0;
		}
	}

	public void calculaTotal(double[] meses) {
		for (int i = 0; i < meses.length - 1; i++) {
			total += meses[i];
		}
	}
	
	public void gastosMeses() {
		for (int i = 0; i < meses.length - 1; i++) {
			System.out.println(meses[i]);
		}
		
	}
	
	public double getTotal() {
		return total;
	}
}
