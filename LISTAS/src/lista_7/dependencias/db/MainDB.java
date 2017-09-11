package lista_7.dependencias.db;


import java.util.List;

import lista_7.dependencias.Dados;

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
			eMes();
			break;
		}
	}
	
	public List<Dados> visualizar(int modo) {
		
		
		switch (modo) {
		case 0:
			return vendas.seleciona();
		case 1:
			return recebimentos.seleciona();
		case 2:
			return pagamentos.seleciona();
		case 3:
			return despesas.seleciona();
		default:
			eMes();
			break;
		}
		
		return null;
	}
	
	private void eMes() {
		System.out.println("não esqueça de implementar as modificações em MainDB()");
	}
}
