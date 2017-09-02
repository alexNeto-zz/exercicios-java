package lista_6;

import java.util.Scanner;

import lista_6.dependencias.*;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		menuPrincipal();

	}

	public static void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Atualizar Quantidade");
		System.out.println("3 - Deletar Produto");
		System.out.println("4 - Gerar Relatório");
		System.out.println("5 - Sair");
		System.out.println();
	}

	public static void menuPrincipal() {
		
		Estoque estoque = new Estoque();
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0:
				imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			case 1:
				estoque.insere();
				opcao = 0;
				break;
			case 2:
				estoque.atualiza();
				opcao = 0;
				break;
			case 3:
				estoque.deleta();
				opcao = 0;
				break;
			case 4:
				estoque.seleciona();
				opcao = 0;
				break;
			case 5:
				sair = 1;
				System.out.println("\nAté mais!");
				break;
			default:
				imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}
	}

}
