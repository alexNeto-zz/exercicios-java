package lista_7.dependencias.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends WidgetsComuns{

	protected JFrame frame;

	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(306, 382, 114, 40);
		frame.add(btnSair);

	}
}
