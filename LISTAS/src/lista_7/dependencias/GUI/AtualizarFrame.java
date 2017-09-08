package lista_7.dependencias.GUI;

import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextArea;

public class AtualizarFrame {

	private JFrame frame;
	private JTextField textField;

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
					AtualizarFrame window = new AtualizarFrame();
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
	public AtualizarFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Vendas", "Recebimentos", "Pagamentos", "Despesas" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(35, 12, 249, 24);
		frame.getContentPane().add(comboBox);

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "nada cadastrado neste campo" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(35, 49, 381, 78);
		frame.getContentPane().add(list);

		JLabel dataLabel = new JLabel("data");
		dataLabel.setBounds(307, 17, 109, 15);
		frame.getContentPane().add(dataLabel);

		JButton voltarButton = new JButton("Voltar");
		voltarButton.setBounds(302, 244, 114, 25);
		frame.getContentPane().add(voltarButton);
		
		JLabel montanteLabel = new JLabel("Montante");
		montanteLabel.setBounds(35, 139, 66, 15);
		frame.getContentPane().add(montanteLabel);
		
		textField = new JTextField();
		textField.setBounds(35, 153, 381, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel descricaoLabel = new JLabel("Descrição");
		descricaoLabel.setBounds(35, 180, 66, 15);
		frame.getContentPane().add(descricaoLabel);
		
		JButton atualizarButton = new JButton("Atualizar");
		atualizarButton.setBounds(35, 244, 114, 25);
		frame.getContentPane().add(atualizarButton);
		
		JTextArea descricaoTextArea = new JTextArea();
		descricaoTextArea.setBounds(35, 196, 381, 42);
		frame.getContentPane().add(descricaoTextArea);
	}
}
