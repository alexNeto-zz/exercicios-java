package lista_5.dependencias;

public interface SqliteCIAD {
	
	String URL = "jdbc:sqlite:agenda.db";
	
	void cria();
	void insere(String nome, String email, String telefone);

}
