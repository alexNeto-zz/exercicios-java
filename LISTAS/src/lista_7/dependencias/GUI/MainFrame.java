package lista_7.dependencias.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import lista_7.dependencias.DB.MainDB;


@SuppressWarnings("serial")
public class MainFrame extends WidgetsComuns {

	protected MainDB bancoDados = new MainDB();
	
	JButton sairButton = new JButton("Sair");

	protected JFrame frame;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		sairButton.setBounds(306, 382, 114, 40);
		frame.add(sairButton);

		sairButton.addActionListener(this);
		this.addWindowListener(this);
	}
}
