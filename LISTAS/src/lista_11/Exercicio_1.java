package lista_11;

import lista_11.dependencias.exercicio_1.gui.MainFrame;

import javax.swing.*;
import java.awt.*;

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
    }
}