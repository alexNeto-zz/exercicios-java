package lista_1;

public class Exercicio_8 {
	
	public static void exercicio() {
		Aluno aluno = new Aluno("João", 14433254, "3A");
		Professor prof = new Professor("Arakaki", 12121212);
		System.out.println(aluno.getNome());
		System.out.println(prof.getNome());
	}

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