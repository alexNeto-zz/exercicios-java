package lista_7.dependencias.gui.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import lista_7.dependencias.db.UsuariosDB;
import lista_7.dependencias.gui.MainFrame;

public class Login implements ActionListener{
	
	private JPanel login = new JPanel();
	private UsuariosDB usuario;
	private JTextField userName;
	private JPasswordField passWd;
	private JButton singupButton = new JButton("Novo usuario");
	private JButton loginButton = new JButton("Entrar");
	private JLabel userNameLabel = new JLabel("Usuario");
	private boolean estado = true;
	

	public Login(){
		
		login.setLayout(null);
		login.setVisible(true);
		
		userNameLabel.setBounds(15, 15, 270, 12);
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
		
		loginButton.setBounds(15, 185, 114, 40);
		login.add(loginButton);
		
		singupButton.setBounds(220, 185, 114, 40);
		login.add(singupButton);
		
		loginButton.addActionListener(this);	
		
	}
	public void mudaEstado() {
		estado = !estado;
	}
	public boolean getVisible() {
		return estado;
	}
	public void setVisible() {
		login.setVisible(estado);
	}
	public JPanel getPane() {
		mudaEstado();
		return login;
	}
	
	public JButton getSingUp() {
		return singupButton;
	}
	public JButton getLogin() {
		return loginButton;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(loginButton)) {
			usuario = new UsuariosDB();
			if(usuario.seleciona(userName.getText(), new String(passWd.getPassword()))) {
				login.setVisible(false);
				new MainFrame();
			}
			else {
				passWd.setText("");
				userName.setText("");
				userNameLabel.setText("Usuário - usuário ou senha incorretos");
				userNameLabel.setForeground(Color.red);
				estado = true;
			}
						
		}
		
	}
}
