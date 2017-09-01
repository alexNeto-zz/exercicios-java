package lista_5.dependencias;

import java.sql.ResultSet;
import java.sql.SQLException;
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

	public void mostraAluno() {
		/*
		 * try {
		 * 
		 * ResultSet al = sqliteBD.selecionaAluno();
		 * System.out.println("Selecione quem deseja editar:"); while (al.next()) {
		 * String[] ps = sqliteBD.seleciona(al.getInt(3));
		 * System.out.println(al.getInt(1) + " - " + ps.getString(2));
		 * System.out.println("Matricula: " + al.getString(2)); } } catch (SQLException
		 * e) { System.out.println(e.getMessage()); }
		 */
	}

	public void mostraProfessor() {
		ResultSet rs = sqliteBD.selecionaProfessor();
		System.out.println("Selecione quem deseja editar:");
		try {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2));
				System.out.println("Registro: " + rs.getString("registro"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void editarAluno() {
		Aluno aluno = cadastrarAluno();
		sqliteBD.atualizaAluno(scanner.nextInt(), aluno.getNome(), aluno.getEmail(), aluno.getTelefone(),
				aluno.getNumeroMatricula());
	}

	public void editarProfessor() {
		Professor professor = cadastrarProfessor();
		sqliteBD.atualizaProfessor(scanner.nextInt(), professor.getNome(), professor.getEmail(),
				professor.getTelefone(), professor.getNumeroRegistro(), professor.getQuantidadeHoraAula());
	}

	public void deletaAluno() {
		mostraAluno();
		sqliteBD.deleteAluno(scanner.nextInt());
	}

	public void deletaProfessor() {
		mostraProfessor();
		sqliteBD.deleteProfessor(scanner.nextInt());
	}
}
