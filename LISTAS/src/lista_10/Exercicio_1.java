package lista_10;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import lista_10.dependencias.exercicio_1.gui.MainFrame;

public class Exercicio_1 {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new MainFrame();
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

		/*
         * Bucket bucket = new Bucket();
		 * 
		 * new Thread(new Producer(bucket)).start(); new Thread(new
		 * Consumer(bucket)).start();
		 */
    }
}