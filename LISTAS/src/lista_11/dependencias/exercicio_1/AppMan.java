package lista_11.dependencias.exercicio_1;

import java.util.Set;

public class AppMan {


    private Agenda agenda = new Agenda();

    public void adicionarContato(Contato contato) {
        new Thread(() -> agenda.add(contato)).start();
    }

    public Set<Contato> getContatos() {
        return agenda.getAll();
    }

    public Contato getContato(String nome) {
        return agenda.get(nome);
    }

    public void removeContato(String nome) {
        new Thread(() -> agenda.remove(nome)).start();
    }

    public void salvar() {

        agenda.salvar();
    }
}
