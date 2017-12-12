package lista_12.dependencias.exercicio_2.cliente.thread;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.NoSuchElementException;

import lista_12.dependencias.exercicio_2.cliente.Clientes;

public class Envia extends Clientes implements Runnable {

	private Socket socket;

	public Envia(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			String mensagem = null;
			try {
				mensagem = msg.getLast();
			} catch (NoSuchElementException e) {
				continue;	
			} catch (Exception e) {
				continue;
			}
			if (mensagem != null)
				if (mensagem.length() > 0) {
					try {
						OutputStream ou = this.socket.getOutputStream();
						Writer ouw = new OutputStreamWriter(ou);
						BufferedWriter bw = new BufferedWriter(ouw);
						bw.write(msg + "\r\n");
						bw.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
		}
	}
}
