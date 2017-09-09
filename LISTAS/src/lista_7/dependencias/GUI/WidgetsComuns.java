package lista_7.dependencias.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import lista_7.dependencias.DB.DataDB;
import lista_7.dependencias.DB.MainDB;

@SuppressWarnings("serial")
public class WidgetsComuns extends JFrame implements ActionListener, WindowListener {

	JFrame frame = new JFrame();

	protected MainDB bancoDados = new MainDB();
	DataDB data = new DataDB();

	protected int idData = data.idAtual();

	protected JLabel dataLabel = new JLabel("Data: " + data.dataFormatada(), JLabel.CENTER);
	protected JLabel montanteLabel = new JLabel("Montante");
	protected JLabel descricaoLabel = new JLabel("Descrição");
	protected JButton sairButton = new JButton("Sair");
	protected JTextField montanteTextField = new JTextField();
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