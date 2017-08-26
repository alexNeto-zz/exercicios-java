package lista_4.dependencias;

import java.awt.List;

public class Agenda {

	private List alunos;
	private List professores;
	
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
	
	public List getAlunos(){
		return alunos;
	}
	
	public void setAlunos(List alunos) {
		this.alunos = alunos;
	}
	
	public List<Professor> getProfessor(){
		return professores;
	}
	
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
}
