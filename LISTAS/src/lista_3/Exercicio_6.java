package lista_3;

import lista_3.dependencias_exercicio_6.*;
import java.util.Scanner;

public class Exercicio_6 {

	public static void exercicio() {
		@SuppressWarnings("resource")
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
				app.cadastrarCliente();
				opcao = 0;
				break;
			case 2:
				app.dadosCadastrais();
				opcao = 0;
				break;
			case 3:
				app.dadosConsumo();
				opcao = 0;
				break;
			case 4:
				app.dadosCompleto();
				opcao = 0;
				break;
			case 5: 
				app.deletarCliente();
				opcao = 0;
				break;
			case 6:
				app.maiorConsumidor();
				opcao = 0;
				break;
			case 7: 
				app.maiorConsumidorMes();
				opcao = 0;
				break;
			case 8:
				app.novoGasto();
				opcao = 0;
				break;
			case 9:
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




