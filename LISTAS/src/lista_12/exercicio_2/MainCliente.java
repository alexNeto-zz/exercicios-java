package lista_12.exercicio_2;

import lista_12.dependencias.exercicio_2.cliente.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		try {
			Cliente cliente = new Cliente();
			while (true) {
				cliente.adicionaMensagem();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
