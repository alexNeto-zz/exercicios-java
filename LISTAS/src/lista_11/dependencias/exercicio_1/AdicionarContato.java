package lista_11.dependencias.exercicio_1;

import javax.swing.*;
import java.io.Serializable;

public class AdicionarContato implements Serializable {

    public static Contato adicionarContato(){
        String nome = JOptionPane.showInputDialog("Nome:");
        String email = JOptionPane.showInputDialog("E-mail:");
        String telefone = JOptionPane.showInputDialog("Telefone:");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);

        return contato;
    }
}
