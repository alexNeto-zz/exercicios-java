package lista_7.dependencias.DB;

public interface InterfaceCIAD {
	
String URL = "jdbc:sqlite:fluxoCaixa.db";
	
	void cria();
	void insere();
	void atualiza();
	void deleta(int id);

}
