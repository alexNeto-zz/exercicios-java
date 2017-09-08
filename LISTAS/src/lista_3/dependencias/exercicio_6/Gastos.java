package lista_3.dependencias.exercicio_6;

import java.time.LocalDate;

public class Gastos {
	private double[] meses = new double[13];
	private String[] nomeMeses = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto",
			"setembro", "outubro", "novembro", "dezembro" };
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
		atualizaMes();
		meses[12] += gasto;
	}

	public void atualizaMes() {
		if (this.mesAtual != getMesAtual()) {
			meses[mesAtual] = meses[12];
			meses[12] = 0;
		}
	}

	public void calculaTotal(double[] meses) {
		total = 0;
		for (int i = 0; i < meses.length - 1; i++) {
			total += meses[i];
		}
	}

	public void gastosMeses() {
		System.out.println();
		for (int i = 0; i < nomeMeses.length; i++) {
			System.out.print(nomeMeses[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < meses.length - 1; i++) {
			System.out.print(meses[i] + "\t");
		}
		System.out.println();

	}

	public double getTotal() {
		calculaTotal(meses);
		return total;
	}

	public double getMeses(int i) {
		return meses[i - 1];
	}

	public void showNomeMeses(int j) {
		if (j == 0) {
			for (int i = 0; i < nomeMeses.length - 1; i++) {
				System.out.println((i + 1) + " - " + nomeMeses[i]);
			}
		}
		else {
			System.out.println(nomeMeses[j]);
		}
	}
}
