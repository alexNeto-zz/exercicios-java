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

	public void dadosCadastrais() {
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("CEP: " + getCep());
		System.out.println("Logradouro: " + getLogradouro());
		System.out.println("Complemento: " + getComplemento());
		System.out.println("Bairro: " + getBairro());
		System.out.println("Localidadde: " + getLocalidade());
		System.out.println("Estado: " + getUf());
	}

	public void dadosConsumo() {
		System.out.println();
		System.out.println("Gastos por meses:");
		gasto.gastosMeses();
		System.out.println();
		System.out.println("Total do cliente: " + gasto.getTotal());
	}

	public void dadosCompletos() {
		dadosCadastrais();
		dadosConsumo();
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getTotal() {
		return gasto.getTotal();
	}
	
	public double getMeses(int i) {
		return gasto.getMeses(i);
	}
	
	public void mostraMeses(int i) {
		gasto.showNomeMeses(i);
	}
	
	
}