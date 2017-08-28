package lista_5.dependencias;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	
	public Agenda() {
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
	}
	
	public void listarTodos() {
		System.out.println("Lista de contatos de alunos: ");
		for(Aluno aluno:alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Telefone: " + aluno.getTelefone());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("Nº Matricula: " + aluno.getNumeroMatricula() + "\n");	
		}
		System.out.println("Lista de contatos de professores: ");
		for(Professor professor:professores) {
			System.out.println("Nome: " + professor.getNome());
			System.out.println("Telefone: " + professor.getTelefone());
			System.out.println("Email: " + professor.getEmail());
			System.out.println("Registro: " + professor.getNumeroRegistro() + "\n");
		}
	}
	
	
	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public ArrayList<Professor> getProfessor(){
		return professores;
	}
	
	public void setProfessores(Professor professore) {
		this.professores.add(professore);
	}
	
}
