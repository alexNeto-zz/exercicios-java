package lista_7.dependencias.LOGIN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Singup implements ActionListener{
	
	private JTextField primeiroNome;
	private JTextField ultimoNome;
	private JTextField email;
	private JTextField userNameCadastro;
	private JPasswordField senha;
	private JPasswordField senhaRepete;	
	private JPanel singup;
	
	public Singup() {
				
		singup = new JPanel();
		singup.setLayout(null);
		
		
		JLabel primeiroNomeLabel = new JLabel("Primeiro Nome");
		primeiroNomeLabel.setBounds(15, 15, 150, 15);
		singup.add(primeiroNomeLabel);
		
		primeiroNome = new JTextField();
		primeiroNome.setBounds(150, 15, 240, 40);
		singup.add(primeiroNome);
		primeiroNome.setColumns(10);
		
		JLabel ultimoNomeLabel = new JLabel("Ultimo Nome");
		ultimoNomeLabel.setBounds(15, 65, 150, 15);
		singup.add(ultimoNomeLabel);
		
		ultimoNome = new JTextField();
		ultimoNome.setBounds(150, 65, 240, 40);
		singup.add(ultimoNome);
		ultimoNome.setColumns(10);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(15, 115, 66, 15);
		singup.add(emailLabel);
		
		email = new JTextField();
		email.setBounds(150, 115, 240, 40);
		singup.add(email);
		email.setColumns(10);
		
		JLabel userNameLabel = new JLabel("Nome de usuário");
		userNameLabel.setBounds(15, 165, 160, 15);
		singup.add(userNameLabel);
		
		userNameCadastro = new JTextField();
		userNameCadastro.setBounds(150, 165, 240, 40);
		singup.add(userNameCadastro);
		userNameCadastro.setColumns(10);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(15, 215, 66, 15);
		singup.add(senhaLabel);
		
		senha =  new JPasswordField();
		senha.setBounds(150, 215, 240, 40);
		singup.add(senha);
		senha.setColumns(10);
		
		JLabel senhaRepeteLabel = new JLabel("Repita a Senha");
		senhaRepeteLabel.setBounds(15, 265, 100, 15);
		singup.add(senhaRepeteLabel);
		
		senhaRepete = new JPasswordField();
		senhaRepete.setBounds(150, 265, 240, 40);
		singup.add(senhaRepete);
		senhaRepete.setColumns(10);
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(15, 335, 114, 40);
		singup.add(cadastrarButton);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPane() {
		return singup;
	}

}
