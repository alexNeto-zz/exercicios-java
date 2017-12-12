package lista_11.dependencias.exercicio_1.gui;

import javax.swing.*;
import java.io.Serializable;

public class MainFrame implements Serializable{

	private JFrame frame;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.getContentPane().add(new VisualizacaoTab().getVisualizacaoPane());
	}
}