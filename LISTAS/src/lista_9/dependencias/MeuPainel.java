package lista_9.dependencias;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MeuPainel extends JPanel {

	/**
	 * Classe usada no exercicio 1 da lista 9 para criar os retangulos pedidos pelo
	 * exercício
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < 15; i++) {
			g.drawRect(10 + 10 * i, 10 + 10 * i, 50 + i * 10, 50 + i * 10);
		}
	}
}
