package lista_1.dependencias;

public abstract class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}