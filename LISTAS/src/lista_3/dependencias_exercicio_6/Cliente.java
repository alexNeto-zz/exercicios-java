package lista_3.dependencias_exercicio_6;

public class Cliente extends Endereco {
	
	private String nome;
	private String email;
	private String telefone;
	private Gastos gasto;

	public Cliente(String nome, String email, String telefone, String cep) {
		super(cep);
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		gasto = new Gastos();
	}

	public void novoGasto(double valor) {
		gasto.adicionarGasto(valor);
		
	}

}