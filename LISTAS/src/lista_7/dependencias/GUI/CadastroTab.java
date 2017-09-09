package lista_7.dependencias.GUI;

import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;;

@SuppressWarnings("serial")
public class CadastroTab extends WidgetsComuns{
	

	private JPanel cadastroPane = new JPanel();
	private JButton salvarButton = new JButton("Salvar");
	
	public CadastroTab() {
		cadastroPane.setLayout(null);
		comboBox.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Vendas", "Recebimentos", "Pagamentos", "Despesas" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(35, 12, 250, 40);
		cadastroPane.add(comboBox);

		dataLabel.setBounds(307, 17, 109, 40);
		cadastroPane.add(dataLabel);

		montanteLabel.setBounds(35, 60, 250, 15);
		cadastroPane.add(montanteLabel);

		montanteTextField.setBounds(35, 80, 250, 40);
		cadastroPane.add(montanteTextField);
		montanteTextField.setColumns(10);

		descricaoLabel.setBounds(35, 130, 66, 15);
		cadastroPane.add(descricaoLabel);

		descricaoTextArea.setBounds(35, 150, 250, 120);
		descricaoTextArea.setLineWrap(true);
		descricaoTextArea.setWrapStyleWord(true);
		cadastroPane.add(descricaoTextArea);

		salvarButton.setBounds(35, 280, 114, 40);
		cadastroPane.add(salvarButton);
		
		sairButton.setBounds(295, 340, 114, 40);
		cadastroPane.add(sairButton);

		salvarButton.addActionListener(this);
		sairButton.addActionListener(this);
		this.addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(salvarButton)) {
			montanteLabel.setText("Montante");
			montanteLabel.setForeground(Color.black);
			double montante;
			try {
				montante = Double.parseDouble(montanteTextField.getText());
				bancoDados.inserir(comboBox.getSelectedIndex(), montante, descricaoTextArea.getText(), idData);
			} catch (NumberFormatException err) {
				montanteLabel.setText("Montante - deve ser um número (xx.xx)");
				montanteLabel.setForeground(Color.red);

			}
			montanteTextField.setText("");
			descricaoTextArea.setText("");
		}
		if (e.getSource().equals(sairButton)) {
			System.exit(1);
		}
	}
	public JPanel getCadastroPane() {
		return cadastroPane;
	}

}
