package lista_7.dependencias.DB;

public class MainDB {

	VendasDB vendas = new VendasDB();
	RecebimentosDB recebimentos = new RecebimentosDB();
	DespesasDB despesas = new DespesasDB();
	PagamentosDB pagamentos = new PagamentosDB();

	public MainDB() {
		vendas = new VendasDB();
		recebimentos = new RecebimentosDB();
		despesas = new DespesasDB();
		pagamentos = new PagamentosDB();
	}

	public void inserir(int modo, Double montante, String descricao, int idData) {
		switch (modo) {
		case 0:
			vendas.setMontante(montante);
			vendas.setDescricao(descricao);
			vendas.setData(idData);
			vendas.insere();
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}
}
