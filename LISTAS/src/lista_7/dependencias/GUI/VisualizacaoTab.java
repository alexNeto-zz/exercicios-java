package lista_7.dependencias.GUI;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;;

@SuppressWarnings("serial")
public class VisualizacaoTab extends WidgetsComuns{
	

	protected JPanel VisualizacaoPane = new JPanel();
	private JButton atualizarButton = new JButton("Atualizar");
	
	public VisualizacaoTab() {
		VisualizacaoPane.setLayout(null);
		comboBox.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Vendas", "Recebimentos", "Pagamentos", "Despesas" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(35, 12, 250, 40);
		VisualizacaoPane.add(comboBox);

		dataLabel.setBounds(307, 17, 109, 40);
		VisualizacaoPane.add(dataLabel);

		montanteLabel.setBounds(35, 60, 250, 15);
		VisualizacaoPane.add(montanteLabel);
		
		descricaoLabel.setBounds(220, 60, 66, 15);
		VisualizacaoPane.add(descricaoLabel);
		
	    JPanel panel = new JPanel(new BorderLayout());
	    panel.setBounds(35, 80, 370, 250);

        List<String> labels = new ArrayList<>(25);
        for (int index = 0; index < 100; index++) {
            labels.add("Item " + index);
        }

        final JList<String> listArea = new JList<String>(labels.toArray(new String[labels.size()]));
        listArea.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScroller = new JScrollPane();
        listScroller.setViewportView(listArea);
        listArea.setLayoutOrientation(JList.VERTICAL);
        panel.add(listScroller);
        VisualizacaoPane.add(panel);
       
    	sairButton.setBounds(295, 340, 114, 40);
		VisualizacaoPane.add(sairButton);
		
        atualizarButton.setBounds(35, 340, 114, 40);
		VisualizacaoPane.add(atualizarButton);		
		
		atualizarButton.addActionListener(this);
		sairButton.addActionListener(this);
		this.addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(atualizarButton)) {
			
			try {
				
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
