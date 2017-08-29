package lista_5.dependencias;

import java.sql.*;

public class SqliteInterface {

	Connection conn = null;
	String url = "jdbc:sqlite:agenda.db";

	public SqliteInterface() {
		criarTabelas();
		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
				criarTabelas();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void criarTabelas() {

		String pessoa = "create table if not exists pessoa (" + "id_pessoa integer not null primary key autoincrement,"
				+ "nome varchar(24) not null, " + "email varchar(255) not null unique,"
				+ "telefone varchar(11) not null unique);";
		String aluno = "create table if not exists aluno(" + "id_aluno integer not null primary key autoincrement,"
				+ "matricula char(12) unique," + "id_pessoa integer unique,"
				+ "foreign key (id_pessoa) REFERENCES pessoa (id_pessoa)ON UPDATE SET default);";
		String professor = "create table if not exists professor(" + "id_professor integer not null primary key autoincrement,"
				+ "registro char(12) unique, aulahora varchar," + "id_pessoa integer unique,"
				+ " foreign key (id_pessoa) references pessoa(id_pessoa) on update set default);";

		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			// create a new table
			stmt.execute(pessoa);
			stmt.execute(aluno);
			stmt.execute(professor);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private Connection conecta() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public ResultSet selecionaUltimoIDPessoa() {
		String sql = "SELECT MAX(id_pessoa) FROM pessoa";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			return rs;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void insereAluno(String nome, String email, String telefone, String matricula) {
		String pessoa = "insert into pessoa(nome, email, telefone) values(?, ?, ?);";
		String aluno = "insert into aluno(matricula, id_pessoa) values(?, ?)";
		try (Connection conn = this.conecta();
				PreparedStatement pstmt = conn.prepareStatement(pessoa);
				PreparedStatement altmt = conn.prepareStatement(aluno)) {
			ResultSet ultimoID = selecionaUltimoIDPessoa();
			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.executeUpdate();
			altmt.setString(1, matricula);
			altmt.setInt(2, ultimoID.getInt("id_pessoa"));
			altmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void insereProfessor(String nome, String email, String telefone, String registro, String aulahora) {
		String pessoa = "insert into pessoa(nome, email, telefone) values(?, ?, ?);";
		String professor = "insert into professor(registro, aulahora) value(?, ?);";
		try (Connection conn = this.conecta();
				PreparedStatement pstmt = conn.prepareStatement(pessoa);
				PreparedStatement prtmt = conn.prepareStatement(professor)) {
			ResultSet ultimoID = selecionaUltimoIDPessoa();
			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.executeUpdate();
			prtmt.setString(1, registro);
			prtmt.setString(2, aulahora);
			prtmt.setInt(3, ultimoID.getInt("id_pessoa"));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public ResultSet selecionaAluno() {
		String sql = "select * from aluno;";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			return rs;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public ResultSet selecionaProfessor() {
		String sql = "select * from professor;";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			return rs;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void atualizaAluno(int id, String nome, String email, String telefone, String matricula) {
		String pessoa = "update pessoa set nome = ?, email = ?, telefone = ? where id = ?;";
		String aluno = "update aluno set matricula = ? where id = ?;";
		String sql = "select id_pessoa from aluno where id = ?;";
		try (Connection conn = this.conecta();
				PreparedStatement pstmt = conn.prepareStatement(pessoa);
				PreparedStatement altmt = conn.prepareStatement(aluno);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.setInt(4, rs.getInt(id));
			pstmt.executeUpdate();
			altmt.setString(1, matricula);
			altmt.setInt(2, id);
			altmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void atualizaProfessor(int id, String nome, String email, String telefone, String registro,
			String aulahora) {
		String pessoa = "update pessoa set nome = ?, email = ?, telefone = ? where id = ?;";
		String professor = "update professor set registro = ?, aulahora = ? where id = ?;";
		String sql = "select id_pessoa from aluno where id = ?;";
		try (Connection conn = this.conecta();
				PreparedStatement pstmt = conn.prepareStatement(pessoa);
				PreparedStatement prtmt = conn.prepareStatement(professor);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.setInt(4, rs.getInt(id));
			pstmt.executeUpdate();
			prtmt.setString(1, registro);
			prtmt.setString(2, aulahora);
			prtmt.setInt(3, id);
			prtmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteAluno(int id) {
		String sql = "delete from aluno where id = ?";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteProfessor(int id) {
		String sql = "delete from professor where id = ?";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
