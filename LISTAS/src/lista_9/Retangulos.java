package lista_9;

import javax.swing.JFrame;

import lista_9.dependencias.MeuPainel;

public class Retangulos {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(3);
		frame.setSize(360, 380);
		frame.getContentPane().add(new MeuPainel());
		frame.setVisible(true);
	}

}
