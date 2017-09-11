package lista_7.dependencias.gui;

import java.awt.event.ActionEvent;
import javax.swing.*;

import lista_7.dependencias.Dados;;

@SuppressWarnings("serial")
public class TotaisTab extends WidgetsComuns {

	protected JPanel totaisPane = new JPanel();
	private JButton atualizarButton = new JButton("Atualizar");
	double[] montantes = new double[4];

	private JLabel vendasTotalLabel = new JLabel("Vendas: ");
	private JLabel recebimentosTotalLabel = new JLabel("Recebimentos: ");
	private JLabel pagamentosTotalLabel = new JLabel("Pagamentos: ");
	private JLabel despesasTotalLabel = new JLabel("Despesas: ");

	public TotaisTab() {
		totaisPane.setLayout(null);

		dataLabel.setBounds(450, 17, 109, 40);
		totaisPane.add(dataLabel);

		vendasTotalLabel.setBounds(15, 15, 240, 15);
		totaisPane.add(vendasTotalLabel);
		
		recebimentosTotalLabel.setBounds(15, 65, 240, 15);
		totaisPane.add(recebimentosTotalLabel);
		
		despesasTotalLabel.setBounds(15, 115, 240, 15);
		totaisPane.add(despesasTotalLabel);
		
		pagamentosTotalLabel.setBounds(15, 165, 240, 15);
		totaisPane.add(pagamentosTotalLabel);

		sairButton.setBounds(450, 320, 114, 40);
		totaisPane.add(sairButton);

		atualizarButton.setBounds(35, 320, 114, 40);
		totaisPane.add(atualizarButton);

		atualizarButton.addActionListener(this);
		sairButton.addActionListener(this);
		this.addWindowListener(this);
	}

	private void atualizaTotalMontante(int i) {
		for (Dados c : bancoDados.visualizar(i)) {
			montantes[i] += c.getMontante();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(atualizarButton)) {
			try {
				
				
				for(int i = 0; i < 4; i++) {
					montantes[i] = 0;
					atualizaTotalMontante(i);
				}
				vendasTotalLabel.setText("Vendas: " + montantes[0]);
				recebimentosTotalLabel.setText("Recebimentos: " + montantes[1]);
				pagamentosTotalLabel.setText("Pagamentos: " + montantes[2]);
				despesasTotalLabel.setText("Despesas: " + montantes[3]);
				
			} catch (NumberFormatException err) {

			}
		}
		if (e.getSource().equals(sairButton)) {
			System.exit(1);
		}
	}

	public JPanel getTotaisPane() {
		return totaisPane;
	}

}
