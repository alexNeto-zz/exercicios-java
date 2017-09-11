package lista_7.dependencias.LOGIN;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{
	
	private JPanel login = new JPanel();
	private JTextField userName;
	private JPasswordField passWd;
	private JButton singupButton = new JButton("Novo usuario");
	private boolean estado = true;

	public Login(){
		
		login.setLayout(null);
		login.setVisible(true);
		
		JLabel userNameLabel = new JLabel("Usuario");
		userNameLabel.setBounds(15, 15, 70, 12);
		login.add(userNameLabel);
		
		userName = new JTextField();
		userName.setBounds(15, 35, 240, 40);
		login.add(userName);
		userName.setColumns(10);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(15, 100, 70, 12);
		login.add(senhaLabel);
		
		passWd = new JPasswordField();
		passWd.setBounds(15, 120, 240, 40);
		login.add(passWd);
		
		JButton loginButton = new JButton("Entrar");
		loginButton.setBounds(15, 185, 114, 40);
		login.add(loginButton);
		
		singupButton.setBounds(220, 185, 114, 40);
		login.add(singupButton);
		
		
	}
	public void SetVisible() {
		estado = !estado;
		login.setVisible(estado);
	}
	public JPanel getPane() {
		return login;
	}
	
	public JButton getSingUp() {
		return singupButton;
	}
}
