package lista_1;

public class Exercicio_5 {

	/*
	 * Desenvolva um aplicativo que determinará se um cliente de uma loja de
	 * departamentos excedeu o limite de crédito em uma conta-corrente. Para cada
	 * cliente, os seguintes fatos estão disponíveis: * número da conta; * saldo no
	 * início do mês; * total de todos os itens cobrados desse cliente no mês; *
	 * total de créditos aplicados ao cliente no mês; * limite de crédito
	 * autorizado. O programa deve inserir todos esses fatos com ponteiros, calcular
	 * o novo saldo (= saldo inicial + despesas - créditos), exibir o novo saldo e
	 * determinar se o novo saldo excede o limite de crédito do cliente. Avisar se o
	 * crédito do cliente está excedido ou não.
	 */
	public static void exercicio() {

		Cliente[] clientes = new Cliente[10];
		// se der tempo, mudar para um SQLite, ou não
		int[] numeroConta = new int[10];
		double[][] dadosConta = { // {saldoInicioMes, totalItensMes, totalCreditoMes, limite}
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 400.00, 100.00, 1000.00 }, { 1000.00, 300.00, 100.00, 2000.00 } };
		for (int i = 0; i < clientes.length; i++) {
			numeroConta[i] = i + 1;
			clientes[i] = new Cliente(numeroConta[i], dadosConta[i][0], dadosConta[i][1], dadosConta[i][2],
					dadosConta[i][3]);
		}
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].verificaLimite() == true) {
				clientes[i].setNovoSaldo();
				System.out.println("Novo saldo de: " + clientes[i].getNovoSaldo());
			}
			else {
				System.out.println("Limite insuficiente para cliente nº " + clientes[i].getNumeroConta());
			}
		}
	}
}
