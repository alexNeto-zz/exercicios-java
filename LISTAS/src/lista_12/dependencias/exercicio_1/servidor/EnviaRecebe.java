package lista_12.dependencias.exercicio_1.servidor;

import java.net.Socket;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class EnviaRecebe {

	private LinkedList<String> coordenadas = new LinkedList<>();
	private boolean available = false;

	public synchronized String get() {
		if (!available) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		String ultimo;
		try {
		ultimo = coordenadas.removeLast();
		//System.out.println("get");
		} catch (NoSuchElementException e) {
			ultimo = "";
		}
		available = false;
		notify();
		return ultimo;
	}

	public synchronized void put(String coordenada, Socket socket) {
		if (available) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		if (coordenada != null) {

			StringBuffer sb = new StringBuffer();
			sb.append(coordenada);
			sb.append("ip:").append(socket.getRemoteSocketAddress().toString().substring(1));
			//getRemoteSocketAddress().toString().substring(1)
			
			coordenadas.add(sb.toString());
		}
		available = true;
		//System.out.println("set");
		notify();
	}
}
