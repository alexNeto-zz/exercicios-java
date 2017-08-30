package lista_5.dependencias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Agenda {

	SqliteInterface sqliteBD = new SqliteInterface();
	Aluno aluno = new Aluno();
	Professor professor = new Professor();
	Scanner scanner = new Scanner(System.in);

	public void listarAlunos() {
		ResultSet rs = sqliteBD.selecionaAluno();
		try {
			while (rs.next()) {
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setTelefone(rs.getString("telefone"));
				aluno.setNumeroMatricula(rs.getString("matricula"));
				System.out.println(aluno.dadosFormatados());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void listarProfessor() {
		ResultSet rs = sqliteBD.selecionaProfessor();
		try {
			while (rs.next()) {
				professor.setNome(rs.getString("nome"));
				professor.setEmail(rs.getString("email"));
				professor.setTelefone(rs.getString("telefone"));
				professor.setNumeroRegistro(rs.getString("matricula"));
				professor.setQuantidadeHoraAula(rs.getString("aulahora"));
				System.out.println(aluno.dadosFormatados());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

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

	public void cadastrarNovoAluno() {
		Aluno novoAluno = cadastrarAluno();
		sqliteBD.insere(novoAluno.getNome(), novoAluno.getEmail(), novoAluno.getTelefone());
		sqliteBD.insereAluno(novoAluno.getNumeroMatricula());
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

	public void cadastrarNovoProfessor() {
		Professor novoProfessor = cadastrarProfessor();
		sqliteBD.insere(novoProfessor.getNome(), novoProfessor.getEmail(), novoProfessor.getTelefone());
		sqliteBD.insereProfessor(novoProfessor.getNumeroRegistro(), novoProfessor.getQuantidadeHoraAula());
	}

	public void mostraAluno() {
		ResultSet rs = sqliteBD.selecionaAluno();
		System.out.println("Selecione quem deseja editar:");
		try {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2));
				System.out.println("Matricula: " + rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
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
