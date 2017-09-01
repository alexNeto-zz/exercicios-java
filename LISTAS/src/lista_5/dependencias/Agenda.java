package lista_5.dependencias;

import java.util.Scanner;

public class Agenda {

	SqliteInterface sqliteBD = new SqliteInterface();
	Aluno aluno = new Aluno();
	Professor professor = new Professor();
	Scanner scanner = new Scanner(System.in);

	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome: ");
		aluno.setNome(scanner.next());
		System.out.println("Digite o email: ");
		aluno.setEmail(scanner.next());
		System.out.println("Digite o telefone: ");
		aluno.setTelefone(scanner.next());
		System.out.println("Digite o número da matricula: ");
		aluno.setNumeroMatricula(scanner.next());
		return aluno;
	}

	public Professor cadastrarProfessor() {
		Professor professor = new Professor();
		System.out.println("Digite o nome: ");
		professor.setNome(scanner.next());
		System.out.println("Digite o email: ");
		professor.setEmail(scanner.next());
		System.out.println("Digite o telefone: ");
		professor.setTelefone(scanner.next());
		System.out.println("Digite o número do registro: ");
		professor.setNumeroRegistro(scanner.next());
		System.out.println("Digite a quantidade de hora/aula: ");
		professor.setQuantidadeHoraAula(scanner.next());
		return professor;
	}

	public void cadastrarNovoAluno() {
		Aluno novoAluno = cadastrarAluno();
		sqliteBD.insereAluno(novoAluno.getNome(), novoAluno.getEmail(), novoAluno.getTelefone(),
				novoAluno.getNumeroMatricula());
	}

	public void cadastrarNovoProfessor() {
		Professor novoProfessor = cadastrarProfessor();
		sqliteBD.insereProfessor(novoProfessor.getNome(), novoProfessor.getEmail(), novoProfessor.getTelefone(),
				novoProfessor.getNumeroRegistro(), novoProfessor.getQuantidadeHoraAula());
	}

	public void listarAluno() {
		sqliteBD.selecionaAluno(1);
	}

	public void listarProfessor() {
		sqliteBD.selecionaProfessor(1);
	}

	public void editarAluno() {

		System.out.println("Qual aluno deseja atualizar:");
		sqliteBD.selecionaAluno(0);
		int id = scanner.nextInt();
		Aluno aluno = cadastrarAluno();
		sqliteBD.atualizaAluno(id, aluno.getNome(), aluno.getEmail(), aluno.getTelefone(), aluno.getNumeroMatricula());

	}

	public void editarProfessor() {
		Professor professor = cadastrarProfessor();
		System.out.println("Qual professor deseja atualizar:");
		sqliteBD.selecionaProfessor(0);
		int id = scanner.nextInt();
		sqliteBD.atualizaProfessor(id, professor.getNome(), professor.getEmail(), professor.getTelefone(),
				professor.getNumeroRegistro(), professor.getQuantidadeHoraAula());
	}

	public void deletaAluno() {
		sqliteBD.selecionaAluno(0);
		sqliteBD.deleteAluno(scanner.nextInt());
	}

	public void deletaProfessor() {
		sqliteBD.selecionaProfessor(0);
		sqliteBD.deleteProfessor(scanner.nextInt());
	}
}
