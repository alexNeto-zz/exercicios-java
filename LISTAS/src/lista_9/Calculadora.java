package lista_9;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import lista_9.dependencias.CalculadoraSimples;

public class Calculadora {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CalculadoraSimples frame = new CalculadoraSimples();
					frame.setVisible(true);
				} catch (UnsupportedLookAndFeelException e) {
					// handle exception
				} catch (ClassNotFoundException e) {
					// handle exception
				} catch (InstantiationException e) {
					// handle exception
				} catch (IllegalAccessException e) {
					// handle exception
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
