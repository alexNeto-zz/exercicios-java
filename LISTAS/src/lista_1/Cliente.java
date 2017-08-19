package lista_1;


public class Cliente {

	private int numeroConta;
	private double saldoInicioMes;
	private double totalItensMes;
	private double totalCreditoMes;
	private double limite;
	private double novoSaldo;
	
	public Cliente() {}
	public Cliente(int numeroConta, double saldoInicioMes,
			double totalItensMes, double totalCreditoMes, double limite) {
		this.numeroConta = numeroConta;
		this.saldoInicioMes = saldoInicioMes;
		this.totalItensMes = totalItensMes;
		this.totalCreditoMes = totalCreditoMes;
		this.limite = limite;
		
	}
	public boolean verificaLimite() {
		if((this.saldoInicioMes + this.totalItensMes) < this.limite)
			return true;
		return false;	
	}
	public void setNovoSaldo() {
		this.novoSaldo = saldoInicioMes + totalItensMes - totalCreditoMes;
		System.out.println("Compra realizada com sucesso  para cliente nº " + numeroConta);
	}
	public double getNovoSaldo() {
		return novoSaldo;
	}
	public double getNumeroConta() {
		return numeroConta;
	}
}
