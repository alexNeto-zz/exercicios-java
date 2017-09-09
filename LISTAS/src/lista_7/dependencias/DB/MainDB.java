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
			recebimentos.setMontante(montante);
			recebimentos.setDescricao(descricao);
			recebimentos.setData(idData);
			recebimentos.insere();
			break;
		case 2:
			pagamentos.setMontante(montante);
			pagamentos.setDescricao(descricao);
			pagamentos.setData(idData);
			pagamentos.insere();
			break;
		case 3:
			despesas.setMontante(montante);
			despesas.setDescricao(descricao);
			despesas.setData(idData);
			despesas.insere();
			break;
		default:
			System.out.println("não esqueça de implementar as modificações em MainDB()");
			break;
		}
	}
}
