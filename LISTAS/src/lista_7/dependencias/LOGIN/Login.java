package lista_7.dependencias.LOGIN;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField userName;
	private JPasswordField passWd;
	private JTextField primeiroNome;
	private JTextField ultimoNome;
	private JTextField email;
	private JTextField userNameCadastro;
	private JPasswordField senha;
	private JPasswordField senhaRepete;
	
	public Login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel login = new JPanel();
		frame.getContentPane().add(login, BorderLayout.CENTER);
		login.setLayout(null);
		
		JLabel userNameLabel = new JLabel("Usuario");
		userNameLabel.setBounds(15, 15, 70, 12);
		login.add(userNameLabel);
		
		userName = new JTextField();
		userName.setBounds(15, 35, 180, 40);
		login.add(userName);
		userName.setColumns(10);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(15, 100, 70, 12);
		login.add(senhaLabel);
		
		passWd = new JPasswordField();
		passWd.setBounds(15, 130, 180, 40);
		login.add(passWd);
		
		JButton loginButton = new JButton("Entrar");
		loginButton.setBounds(40, 211, 114, 25);
		login.add(loginButton);
		
		JButton singup = new JButton("Novo usuario");
		singup.setBounds(220, 211, 114, 25);
		login.add(singup);
		/*
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(35, 12, 66, 15);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 10, 124, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(45, 39, 66, 15);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 41, 124, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(35, 66, 66, 15);
		panel_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 64, 124, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(35, 93, 66, 15);
		panel_1.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 95, 124, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(45, 120, 66, 15);
		panel_1.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(156, 118, 124, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(45, 168, 66, 15);
		panel_1.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(156, 166, 124, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(120, 218, 114, 25);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(297, 218, 114, 25);
		panel_1.add(btnNewButton_3);
		
		*/
	}
}
