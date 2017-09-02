package lista_5.dependencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteCIADImplements implements SqliteCIAD {
	
	protected Connection conecta() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	@Override
	public void cria() {

		String pessoa = "create table if not exists pessoa (" + "id_pessoa integer not null primary key autoincrement,"
				+ "nome varchar(24) not null, " + "email varchar(255) not null unique,"
				+ "telefone varchar(11) not null unique);";
		String aluno = "create table if not exists aluno(" + "id_aluno integer not null primary key autoincrement,"
				+ "matricula char(12) unique," + "id_pessoa integer unique,"
				+ "foreign key (id_pessoa) references pessoa(id_pessoa) on update set default);";
		String professor = "create table if not exists professor("
				+ "id_professor integer not null primary key autoincrement,"
				+ "registro char(12) unique, aulahora varchar," + "id_pessoa integer unique,"
				+ " foreign key (id_pessoa) references pessoa(id_pessoa) on update set default);";

		try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
			// create a new table
			stmt.execute(pessoa);
			stmt.execute(aluno);
			stmt.execute(professor);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public int selecionaUltimoIDPessoa() {
		String sql = "SELECT MAX(id_pessoa) FROM pessoa";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			System.out.println(rs.getInt(1));
			return rs.getInt(1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public void insere(String nome, String email, String telefone) {
		String pessoa = "insert into pessoa(nome, email, telefone) values(?, ?, ?);";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(pessoa)) {
			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void insereAluno(String nome, String email, String telefone, String matricula) {
		insere(nome, email, telefone);
		String aluno = "insert into aluno(matricula, id_pessoa) values(?, ?)";
		try (Connection conn = this.conecta(); PreparedStatement altmt = conn.prepareStatement(aluno)) {
			int ultimoID = selecionaUltimoIDPessoa();
			if (ultimoID != 0) {
				altmt.setString(1, matricula);
				altmt.setInt(2, ultimoID);
				altmt.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void insereProfessor(String nome, String email, String telefone, String registro, String aulahora) {
		insere(nome, email, telefone);
		String professor = "insert into professor(registro, aulahora, id_pessoa) values(?, ?, ?);";
		try (Connection conn = this.conecta(); PreparedStatement prtmt = conn.prepareStatement(professor)) {
			int ultimoID = selecionaUltimoIDPessoa();
			if (ultimoID != 0) {
				prtmt.setString(1, registro);
				prtmt.setString(2, aulahora);
				prtmt.setInt(3, ultimoID);
				prtmt.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
