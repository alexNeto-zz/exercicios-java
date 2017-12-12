package lista_12.dependencias.exercicio_1.servidor;

public class Ping extends Clientes implements Runnable{

	@Override
	public void run() {
		msg.add("mensagem enviada pelo servidor");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
