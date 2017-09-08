package lista_6.dependencias;

public interface SqliteCIAD {
	
String URL = "jdbc:sqlite:estoque.db";
	
	void cria();
	void insere(String produto, int quantidade);
	void atualiza(String produto, int quantidade);
	void deleta(String produto);

}
