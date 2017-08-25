package lista_1;

public class Exercicio_8 {
	// se sobrar tempo, crie os objetos e mostre eles

}

abstract class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}

class Aluno extends Pessoa {

	public int numeroMatricula;
	public String turma;

	public Aluno(String nome, int numeroMatricula, String turma) {
		super(nome);
		this.numeroMatricula = numeroMatricula;
		this.turma = turma;
	}
}

class Professor extends Pessoa{
	
	public int numeroMatricula;
	public String[] turmas;
	
	public Professor(String nome, int numeroMatricula) {
		super(nome);
		this.numeroMatricula = numeroMatricula;
	}
	
	public void setDiciplinas(String[] turmas) {
		this.turmas = turmas;
	}
}