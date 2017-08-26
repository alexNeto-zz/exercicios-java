package lista_3;

import java.io.*;

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
		// create runtime to execute external command
		try {
			Process p = Runtime.getRuntime().exec("python3 ./src/lista_3/getCep.py");
			BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			
			while ((line = bfr.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}

/*
 * class Cliente {
 * 
 * private String nome; private String email; private String teleefone; private
 * Endereco endereco;
 * 
 * 
 * }
 * 
 * class Gastos { private double janeiro; private double fevereiro; private
 * double marco; private double abril; private double maio; private double
 * junho; private double julho; private double agosto; private double setembro;
 * private double outubro; private double novembro; private double dezembro;
 * private double total; private double parcial; private int mesAtual; }
 * 
 * class Endereco { }
 */
