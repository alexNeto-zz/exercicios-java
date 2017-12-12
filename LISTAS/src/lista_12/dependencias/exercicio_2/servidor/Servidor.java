package lista_12.dependencias.exercicio_2.servidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.NoSuchElementException;

public class Servidor extends Clientes implements Runnable {
	private Socket con;
	private InputStream in;
	private InputStreamReader inr;

	public Servidor(Socket con) {
		this.con = con;
		try {
			in = con.getInputStream();
			inr = new InputStreamReader(in);
			new BufferedReader(inr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {

		try {
			OutputStream ou = this.con.getOutputStream();
			Writer ouw = new OutputStreamWriter(ou);
			BufferedWriter bfw = new BufferedWriter(ouw);
			clientes.add(bfw);
			String mensagem = msg.removeLast();
			while (mensagem != null) {
				sendToAll(mensagem);
			}
		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(3500L);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendToAll(String msg) throws IOException {
		for (BufferedWriter bw : clientes) {
			bw.write(msg + "\r\n");
			bw.flush();
		}
	}
}