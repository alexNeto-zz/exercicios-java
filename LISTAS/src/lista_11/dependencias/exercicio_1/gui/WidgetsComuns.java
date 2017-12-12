package lista_11.dependencias.exercicio_1.gui;

import lista_11.dependencias.exercicio_1.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Serializable;

@SuppressWarnings("serial")
public class WidgetsComuns extends JFrame implements ActionListener, WindowListener, Serializable {

	JFrame frame = new JFrame();

	/*
	 * protected MainDB bancoDados = new MainDB(); DataDB data = new DataDB();
	 */
//	protected int idData = data.idAtual();

	protected JLabel dataLabel = new JLabel("Data: " + new Data().dataFormatada(), JLabel.CENTER);
	protected JLabel nomeLabel = new JLabel("Montante");
	protected JLabel descricaoLabel = new JLabel("Descrição");
	protected JButton sairButton = new JButton("Sair");
	protected JTextField nomeTextField = new JTextField();
	protected JTextArea descricaoTextArea = new JTextArea();
	protected JButton voltarButton = new JButton("Voltar");

	protected JComboBox<String> comboBox = new JComboBox<String>();

	protected JList<String> list = new JList<String>();

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}