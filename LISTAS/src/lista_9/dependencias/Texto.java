package lista_9.dependencias;

import javax.swing.JTextField;

public class Texto {

	private JTextField text;

	public Texto(int x, int y, int largura, int altura, int colunas) {
		text = new JTextField();
		text.setBounds(x, y, largura, altura);
		text.setColumns(colunas);
	}

	public JTextField getTexto() {
		return text;
	}

}
