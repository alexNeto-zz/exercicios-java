package lista_10.dependencias.exercicio_1;

import java.util.ArrayList;

public class AppMan {


    private Agenda agenda = new Agenda();

    public void adicionarContato(Contato contato) {
        new Thread(() -> agenda.add(contato)).start();
    }

    public void atualizaContato(int id, Contato contato) {
        agenda.modify(id, contato);
    }

    public ArrayList<Contato> getContatos() {
        return agenda.getAll();
    }

    public Contato getContato(int id) {
        return agenda.get(id);
    }

    public void removeContato(int id) {
        new Thread(() -> agenda.remove(id)).start();
    }

    public void salvar() {

        agenda.salvar();
    }
}
