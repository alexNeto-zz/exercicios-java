package lista_11.dependencias.exercicio_1;

import java.io.Serializable;

public class Contato implements Serializable, Comparable<Contato>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1219677652414579437L;
	private String nome;
	private String email;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int compareTo(Contato o) {
		return this.getNome().compareTo(o.getNome());
	}

}
