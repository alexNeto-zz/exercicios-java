package lista_7.dependencias.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;

public class CadastroFrame {

	private JFrame frame;
	private JTextField montanteTextField;

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
					CadastroFrame window = new CadastroFrame();
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
	public CadastroFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Vendas", "Recebimentos", "Pagamentos", "Despesas" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(35, 12, 249, 24);
		frame.getContentPane().add(comboBox);

		JLabel dataLabel = new JLabel("data");
		dataLabel.setBounds(307, 17, 109, 15);
		frame.getContentPane().add(dataLabel);

		JLabel montanteLabel = new JLabel("Montante");
		montanteLabel.setBounds(35, 48, 66, 15);
		frame.getContentPane().add(montanteLabel);

		montanteTextField = new JTextField();
		montanteTextField.setBounds(35, 64, 249, 23);
		frame.getContentPane().add(montanteTextField);
		montanteTextField.setColumns(10);

		JLabel descricaoTextField = new JLabel("Descrição");
		descricaoTextField.setBounds(35, 99, 66, 15);
		frame.getContentPane().add(descricaoTextField);

		JTextArea descricaoTextArea = new JTextArea();
		descricaoTextArea.setBounds(35, 121, 259, 81);
		frame.getContentPane().add(descricaoTextArea);

		JButton salvarButton = new JButton("Salvar");
		salvarButton.setBounds(180, 231, 114, 25);
		frame.getContentPane().add(salvarButton);

		JButton voltarButton = new JButton("Voltar");
		voltarButton.setBounds(307, 216, 114, 25);
		frame.getContentPane().add(voltarButton);
	}
}
