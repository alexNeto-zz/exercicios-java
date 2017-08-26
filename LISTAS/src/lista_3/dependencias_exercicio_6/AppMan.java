package lista_3.dependencias_exercicio_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppMan {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private Scanner scanner = new Scanner(System.in);

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Cadastrar cliente");//
		System.out.println("2 - Listar dados cadastrais");//
		System.out.println("3 - Listar dados de consumo");//
		System.out.println("4 - Listar todos dados"); //
		System.out.println("5 - Deletar cliente"); //
		System.out.println("6 - Quem consumiu mais geral"); //
		System.out.println("7 - Quem consumiu mais mensal");//
		System.out.println("8 - Adicionar compra"); 
		System.out.println("9 - Sair");
		System.out.println();
	}

	public void cadastrarCliente() {
		System.out.println("\n Insira um nome para a pessoa");
		String nome = scanner.next();
		System.out.println("\nInsira um telefone para a pessoa");
		String telefone = scanner.next();
		System.out.println("\nInsira um email para a pessoa");
		String email = scanner.next();
		System.out.println("\nInsira o cep para a pessoa, apenas numeros");
		String cep = scanner.next();
		System.out.println("Armazenando cliente");
		Cliente novoCliente = new Cliente(nome, email, telefone, cep);
		clientes.add(novoCliente);
		System.out.println("\nNovo contato adicionado\n");
	}

	public void imprimirNomeClientes() {
		int j = 0;
		Iterator<Cliente> iteClie = clientes.iterator();
		while (iteClie.hasNext()) {
			iteClie.next();
			System.out.println((j + 1) + " - Nome: " + clientes.get(j).getNome());
			j++;
		}
	}
	
	public void dadosCadastrais() {
		System.out.println("Deseja ver dados de qual cliente: ");
		imprimirNomeClientes();
		int index = scanner.nextInt();
		clientes.get(index - 1).dadosCadastrais();
		
	}
	
	public void dadosConsumo() {
		System.out.println("Deseja ver dados de qual cliente: ");
		imprimirNomeClientes();
		int index = scanner.nextInt();
		clientes.get(index - 1).dadosConsumo();
	}
	
	public void dadosCompleto() {
		System.out.println("Deseja ver dados de qual cliente: ");
		imprimirNomeClientes();
		int index = scanner.nextInt();
		clientes.get(index - 1).dadosCompletos();
	}

	public void deletarCliente() {
		System.out.println("Qual cliente deseja excluir: ");
		imprimirNomeClientes();
		int deletar = scanner.nextInt();
		clientes.remove(deletar - 1);
	}
	
	public void maiorConsumidor() {
		Cliente maior = clientes.get(0);
		
		int j = 0;
		Iterator<Cliente> iteClie = clientes.iterator();
		while (iteClie.hasNext()) {
			iteClie.next();
			if(clientes.get(j).getTotal() > maior.getTotal()) {
				maior = clientes.get(j);			
			}
			j++;
		}
		System.out.println(maior.getNome() + " consumiu mais no periodo de 12 meses");
		
	}
	
	public void maiorConsumidorMes() {
		Cliente maior = clientes.get(0);
		System.out.println("De Qual mes deseja ver: ");
		clientes.get(0).mostraMeses(0);
		int i = scanner.nextInt();		
		int j = 0;
		Iterator<Cliente> iteClie = clientes.iterator();
		while (iteClie.hasNext()) {
			iteClie.next();
			if(clientes.get(j).getMeses(i) > maior.getMeses(i)) {
				maior = clientes.get(j);			
			}
			j++;
		}
		System.out.printf(maior.getNome() + " consumiu mais no mes de ");
		clientes.get(0).mostraMeses(i);
	}
	
	public void novoGasto() {
		System.out.println("Deseja adicionar valor de compra para qual cliente: ");
		imprimirNomeClientes();
		int index = scanner.nextInt();
		System.out.println("Qual o valor da nova compra: ");
		double valor = scanner.nextDouble();
		clientes.get(index - 1).novoGasto(valor);;
	}
	

}
