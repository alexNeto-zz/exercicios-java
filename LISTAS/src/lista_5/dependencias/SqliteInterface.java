package lista_5.dependencias;

import java.sql.*;

public class SqliteInterface extends SqliteCIADImplements {

	Connection conn = null;

	public SqliteInterface() {
		try (Connection conn = DriverManager.getConnection(URL)) {
			if (conn != null) {
				cria();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public String[] seleciona(int id) {
		String sql = "select * from pessoa where id_pessoa = " + id + ";";
		String[] pessoa = new String[3];
		try (Connection conn = conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			pessoa[0] = rs.getString(2);
			pessoa[1] = rs.getString(3);
			pessoa[2] = rs.getString(4);
			return pessoa;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void selecionaAluno(int modo) {
		String sql = "select * from aluno;";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			if (modo == 0) {
				while (rs.next()) {
					String[] pessoa = seleciona(rs.getInt("id_pessoa"));
					System.out.println(rs.getInt("id_aluno") + " - " + pessoa[0]);
					System.out.println("Matricula: " + rs.getString("matricula"));
					System.out.println();
				}
			} else {
				while (rs.next()) {
					String[] pessoa = seleciona(rs.getInt("id_pessoa"));
					System.out.println("Nome: " + pessoa[0]);
					System.out.println("E-mail: " + pessoa[1]);
					System.out.println("Telefone: " + pessoa[2]);
					System.out.println("Matricula: " + rs.getString("matricula"));
					System.out.println();
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selecionaProfessor(int modo) {
		String sql = "select * from professor;";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			if (modo == 0) {
				while (rs.next()) {
					String[] pessoa = seleciona(rs.getInt("id_pessoa"));
					System.out.println(rs.getInt("id_professor") + " - " + pessoa[0]);
					System.out.println("Registro: " + rs.getString("registro"));
					System.out.println();
				}
			} else {
				while (rs.next()) {
					String[] pessoa = seleciona(rs.getInt("id_pessoa"));
					System.out.println("Nome: " + pessoa[0]);
					System.out.println("E-mail: " + pessoa[1]);
					System.out.println("Telefone: " + pessoa[2]);
					System.out.println("Registro: " + rs.getString("registro"));
					System.out.println("Aula/hora: " + rs.getString("aulahora"));
					System.out.println();
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public int selecionaID(int id, int tipo) {
		String sql = "";
		if (tipo == 1) {
			sql = "select id_pessoa from aluno where id_aluno = " + id + ";";
		} else if (tipo == 2) {
			sql = "select id_pessoa from professor where id_professor = " + id + ";";
		} else {
			return 0;
		}
		int id_pessoa = 0;
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			id_pessoa = rs.getInt("id_pessoa");
			return id_pessoa;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	public void atualizaAluno(int id, String nome, String email, String telefone, String matricula) {
		String pessoa = "update pessoa set nome = ?, email = ?, telefone = ? where id_pessoa = ?;";
		String aluno = "update aluno set matricula = ? where id_aluno = ?;";

		try (Connection conn = this.conecta();
				PreparedStatement pstmt = conn.prepareStatement(pessoa);
				PreparedStatement altmt = conn.prepareStatement(aluno)) {

			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.setInt(4, selecionaID(id, 1)); // 1 = aluno
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
		String pessoa = "update pessoa set nome = ?, email = ?, telefone = ? where id_pessoa = ?;";
		String professor = "update professor set registro = ?, aulahora = ? where id_aluno = ?;";

		try (Connection conn = this.conecta();
				PreparedStatement pstmt = conn.prepareStatement(pessoa);
				PreparedStatement prtmt = conn.prepareStatement(professor)) {

			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setString(3, telefone);
			pstmt.setInt(4, selecionaID(id, 2)); // 2 = professor
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
		String aluno = "delete from aluno where id_aluno = " + id + ";";
		String pessoa = "delete from pessoa where id_pessoa = " + selecionaID(id, 1) + ";";
		try (Connection conn = this.conecta();
				PreparedStatement delaluno = conn.prepareStatement(aluno);
				PreparedStatement delpessoa = conn.prepareStatement(pessoa)) {
			delpessoa.executeUpdate();
			delaluno.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteProfessor(int id) {
		String professor = "delete from professor where id_professor = " + id + ";";
		String pessoa = "delete from pessoa where id_pessoa = " + selecionaID(id, 2) + ";";
		try (Connection conn = this.conecta();
				PreparedStatement delprofessor = conn.prepareStatement(professor);
				PreparedStatement delpessoa = conn.prepareStatement(pessoa)) {
			delpessoa.executeUpdate();
			delprofessor.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
