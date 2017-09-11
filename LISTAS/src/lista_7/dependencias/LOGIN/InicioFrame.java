package lista_7.dependencias.LOGIN;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class InicioFrame implements ActionListener{

	private JFrame frame;
	private Login login = new Login();
	
	
	public InicioFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 275);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(login.getPane(), BorderLayout.CENTER);
		
		login.getSingUp().addActionListener(this);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(login.getSingUp())) {
			login.SetVisible();
			frame.setBounds(100, 100, 400, 425);
			frame.getContentPane().add(new Singup().getPane(), BorderLayout.CENTER);			
		}
		
	}

}
