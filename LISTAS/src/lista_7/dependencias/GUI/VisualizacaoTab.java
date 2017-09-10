package lista_7.dependencias.GUI;

import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import lista_7.dependencias.Dados;;

@SuppressWarnings("serial")
public class VisualizacaoTab extends WidgetsComuns {

	protected JPanel VisualizacaoPane = new JPanel();
	private JButton atualizarButton = new JButton("Visualizar");
	private DefaultTableModel modelo = new DefaultTableModel();

	public VisualizacaoTab() {
		VisualizacaoPane.setLayout(null);
		comboBox.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Vendas", "Recebimentos", "Pagamentos", "Despesas" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(35, 12, 250, 40);
		VisualizacaoPane.add(comboBox);

		dataLabel.setBounds(450, 17, 109, 40);
		VisualizacaoPane.add(dataLabel);

		montanteLabel.setBounds(35, 60, 250, 15);
		VisualizacaoPane.add(montanteLabel);

		descricaoLabel.setBounds(220, 60, 66, 15);
		VisualizacaoPane.add(descricaoLabel);

		// JLabel data2Label = new JLabel("Data");
		// data2Label.setBounds(400, 60, 60, 15);
		// VisualizacaoPane.add(data2Label);

		JPanel panel = new JPanel(new BorderLayout());
		panel.setBounds(35, 80, 525, 220);

		// ArrayList<String> labels =
		// bancoDados.visualizar(comboBox.getSelectedIndex());

		JTable tabela = new JTable(modelo);
		modelo.addColumn("Montante");
		modelo.addColumn("Descrição");
		// modelo.addColumn("Data");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
		JScrollPane barraRolagemScroll = new JScrollPane(tabela);
		panel.add(barraRolagemScroll);
		VisualizacaoPane.add(panel);

		/*
		 * final JList<String> listArea = new JList<String>(labels.toArray(new
		 * String[labels.size()]));
		 * listArea.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); JScrollPane
		 * listScroller = new JScrollPane(); listScroller.setViewportView(listArea);
		 * listArea.setLayoutOrientation(JList.VERTICAL); panel.add(listScroller);
		 * VisualizacaoPane.add(panel);
		 * 
		 */

		sairButton.setBounds(450, 320, 114, 40);
		VisualizacaoPane.add(sairButton);

		atualizarButton.setBounds(35, 320, 114, 40);
		VisualizacaoPane.add(atualizarButton);

		atualizarButton.addActionListener(this);
		sairButton.addActionListener(this);
		this.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(atualizarButton)) {

			try {
				modelo.setNumRows(0);
				
				for (Dados c : bancoDados.visualizar(comboBox.getSelectedIndex())) {
					modelo.addRow(new Object[] { c.getMontante(), c.getDescricao()});
				}

			} catch (NumberFormatException err) {

			}
		}
		if (e.getSource().equals(sairButton)) {
			System.exit(1);
		}
	}

	public JPanel getVisualizacaoPane() {
		return VisualizacaoPane;
	}

}
