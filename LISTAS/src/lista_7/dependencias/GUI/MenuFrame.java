package lista_7.dependencias.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MenuFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame window = new MenuFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 379, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton sairButton = new JButton("Sair");
		sairButton.setBounds(253, 231, 114, 25);
		frame.getContentPane().add(sairButton);
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(133, 23, 114, 25);
		frame.getContentPane().add(cadastrarButton);
		
		JButton visualizarButton = new JButton("Vizualizar");
		visualizarButton.setBounds(133, 60, 114, 25);
		frame.getContentPane().add(visualizarButton);
		
		JButton atualizarButton = new JButton("Atualizar");
		atualizarButton.setBounds(133, 97, 114, 25);
		frame.getContentPane().add(atualizarButton);
		
		JButton deletarButton = new JButton("Deletar");
		deletarButton.setBounds(133, 134, 114, 25);
		frame.getContentPane().add(deletarButton);
		
		JLabel dataLabel = new JLabel("data");
		dataLabel.setBounds(22, 236, 66, 15);
		frame.getContentPane().add(dataLabel);
	}

}
