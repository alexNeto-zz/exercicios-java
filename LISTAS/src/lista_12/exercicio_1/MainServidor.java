package lista_12.exercicio_1;

import java.net.ServerSocket;
import java.net.Socket;

import lista_12.dependencias.exercicio_1.servidor.Servidor;

public class MainServidor {

	private static ServerSocket server;

	public static void main(String[] args) {

		try {
			server = new ServerSocket(1234);

			while (true) {
				System.out.println("Aguardando conexão...");
				Socket con = server.accept();
				System.out.println("Cliente conectado...");
				new Thread(new Servidor(con)).start();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
