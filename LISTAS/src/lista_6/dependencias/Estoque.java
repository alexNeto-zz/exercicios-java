package lista_6.dependencias;

import java.util.Scanner;

public class Estoque{
	
	Scanner scanner = new Scanner(System.in);
	SqliteInterface bd = new SqliteInterface();
	
	public void insere() {
		System.out.println("Digite o nome do produto: ");
		String produto = scanner.next();
		System.out.println("Digite a quantidade: ");
		int quantidade = scanner.nextInt();
			
		bd.insere(produto, quantidade);
	}

	public void atualiza() {
		System.out.println("Digite o produto que deseja atualizar: ");
		String produto = scanner.next();
		System.out.println("Digite a nova quantidade");
		int quantidade = scanner.nextInt();
		
		bd.atualiza(produto, quantidade);
	}

	public void deleta() {
		System.out.println("Digite o produto que deseja deletar: ");
		String produto = scanner.next();
		
		bd.deleta(produto);
	}
	
	public void seleciona() {
		bd.selecionaProdutos();
	}

}
