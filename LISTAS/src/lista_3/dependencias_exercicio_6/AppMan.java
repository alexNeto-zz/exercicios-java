package lista_3.dependencias_exercicio_6;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMan {

	private ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
	private Scanner scanner = new Scanner(System.in);

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Listar contatos \n");
		System.out.println("2 - Incluir contatos \n");
		System.out.println("3 - Sair \n");
	}

	public void cadastrarPessoa() {
		System.out.println("\n Insira um nome para a pessoa");
		String nome = scanner.next();
		System.out.println("\nInsira um telefone para a pessoa");
		String telefone = scanner.next();
		System.out.println("\nInsira um email para a pessoa");
		String email = scanner.next();
		System.out.println("\nInsira o cep para a pessoa, apenas numeros");
		String cep = scanner.next();
		System.out.println("Armazenando cliente");
		Cliente novoCliente = new Cliente(nome, telefone, email, cep);
		Clientes.add(novoCliente);
		System.out.println("\nNovo contato adicionado\n");
	}

	public void imprimirCliente() {

	}
}

