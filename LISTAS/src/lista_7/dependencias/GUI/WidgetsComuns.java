package lista_7.dependencias.GUI;

import javax.swing.*;	

import lista_7.dependencias.Data;

@SuppressWarnings("serial")
public class WidgetsComuns extends JFrame{
	
	JFrame frame = new JFrame();
	
	private Data data = new Data();
	protected JLabel dataLabel = new JLabel(data.dataFormatada(), JLabel.CENTER);
	protected JLabel montanteLabel = new JLabel("Montante");
	protected JLabel descricaoLabel = new JLabel("Descrição");
	
	protected JButton voltarButton = new JButton("Voltar");
	
	protected JComboBox<String> comboBox = new JComboBox<String>();
	
	protected JList<String> list = new JList<String>();

}
