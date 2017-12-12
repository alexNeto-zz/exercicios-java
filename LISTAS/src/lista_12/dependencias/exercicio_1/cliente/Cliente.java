package lista_12.dependencias.exercicio_1.cliente;

import java.io.IOException;
import java.net.Socket;

import lista_12.dependencias.exercicio_1.cliente.thread.Recebe;

public class Cliente{

	private Socket socket;

	public Cliente() {
		try {
			socket = new Socket("127.0.0.1", 1234);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		new Thread(new Recebe(socket)).start();
	}
}