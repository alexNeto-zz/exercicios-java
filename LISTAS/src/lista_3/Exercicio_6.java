package lista_3;

import lista_3.dependencias_exercicio_6.*;
import java.util.Scanner;

public class Exercicio_6 {

	/*
	 * Uma loja o contratou para desenvolver um aplicativo para gerenciamento de
	 * relacionamento com clientes e mineração de dados. O objetivo do é armazenar
	 * informações sobre cada cliente e o total de gasto por cada cliente ao longo
	 * de 12 meses. Dessa forma escreva um aplicativo que armazene informações de
	 * clientes como: Nome, Email, Telefone e Endereço e de dinheiro gasto para cada
	 * uns dos últimos 12 meses. O Aplicativo deve informa o montante gasto por
	 * todos os clientes para cada mês e para o total do período de 12 meses, além
	 * de informa qual foi o cliente que mais gastou dinheiro por mês e no período
	 * total de 12 meses. O aplicativo também deve permitir cadastro e exclusão de
	 * clientes e também a possibilidade editar dados de clientes como telefone ou
	 * endereço.
	 */

	public static void exercicio() {
		Scanner scanner = new Scanner(System.in);
		AppMan app = new AppMan();
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0:
				app.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			case 1:
				// app.imprimirPessoas();
				opcao = 0;
				break;
			case 2:
				app.cadastrarPessoa();
				opcao = 0;
				break;
			case 3:
				sair = 1;
				System.out.println("\nAté mais!");
				break;
			default:
				app.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}
	}
}




