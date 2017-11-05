package lista_9.dependencias;

import javax.swing.JButton;

public class Botao {

	private JButton botao;

	public Botao(String titulo, int x, int y, int largura, int altura) {
		botao = new JButton(titulo);
		botao.setBounds(x, y, largura, altura);
	}

	public JButton getBotao() {
		return botao;
	}

}
