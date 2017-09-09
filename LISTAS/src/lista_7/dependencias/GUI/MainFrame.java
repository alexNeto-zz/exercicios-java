package lista_7.dependencias.GUI;

import java.awt.*;

import javax.swing.*;

public class MainFrame {

	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JFrame frame;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("Cadastro", new CadastroTab().getCadastroPane());
		tabbedPane.addTab("Visualizar", new VisualizacaoTab().getVisualizacaoPane());
	
	}
}