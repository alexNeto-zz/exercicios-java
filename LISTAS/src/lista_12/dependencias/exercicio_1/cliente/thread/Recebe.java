package lista_12.dependencias.exercicio_1.cliente.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Recebe implements Runnable {

	private Socket socket;

	public Recebe(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			String recebido = recebe();
			if (recebido != null) {
				if (recebido.isEmpty()) {
					System.out.println(recebido);
				}
			}
		}
	}

	private String recebe() {
		try {
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String coordenada = br.readLine();
			System.out.println(coordenada);
			if (coordenada != null) {
				return coordenada;
			}
		} catch (IOException e) {
			e.getMessage();
		}
		return "";
	}
}
