package lista_7.dependencias.GUI;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class TabCadastro extends MainFrame {

	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	private JTextField montanteTextField = new JTextField();;

	private JTextArea descricaoTextArea = new JTextArea();

	private JButton salvarButton = new JButton("Salvar");


	public TabCadastro() {
		// TODO Auto-generated constructor stub

		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastro", null, panel, null);
		panel.setLayout(null);

		comboBox.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Vendas", "Recebimentos", "Pagamentos", "Despesas" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(35, 12, 250, 40);
		panel.add(comboBox);

		dataLabel.setBounds(307, 17, 109, 40);
		panel.add(dataLabel);

		montanteLabel.setBounds(35, 60, 66, 15);
		panel.add(montanteLabel);

		montanteTextField.setBounds(35, 80, 250, 40);
		panel.add(montanteTextField);
		montanteTextField.setColumns(10);

		descricaoLabel.setBounds(35, 130, 66, 15);
		panel.add(descricaoLabel);

		descricaoTextArea.setBounds(35, 150, 250, 120);
		descricaoTextArea.setLineWrap(true);
		descricaoTextArea.setWrapStyleWord(true);
		panel.add(descricaoTextArea);

		salvarButton.setBounds(35, 280, 114, 40);
		panel.add(salvarButton);


	}
}
