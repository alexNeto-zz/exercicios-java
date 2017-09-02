package lista_6.dependencias;

import java.sql.*;

public class SqliteInterface implements SqliteCIAD {
	
	Connection conn = null;

	public SqliteInterface() {
	 try (Connection conn = DriverManager.getConnection(URL)) {
		 cria();
     } catch (SQLException e) {
         System.out.println(e.getMessage());
     }
 }

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

		String estoque = "create table if not exists produtos("
				+ "id_produto integer not null primary key autoincrement," + "produto varchar(100) not null unique,"
				+ "quantidade integer not null" + ");";

		try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
			stmt.execute(estoque);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void insere(String produto, int quantidade) {
		String pessoa = "insert into produtos(produto, quantidade) values(?, ?);";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(pessoa)) {
			pstmt.setString(1, produto);
			pstmt.setInt(2, quantidade);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void atualiza(String produto, int quantidade) {
		String atualizaQuantidade = "update produtos set quantidade = ? where produto = ?;";

		try (Connection conn = this.conecta(); PreparedStatement aqtmt = conn.prepareStatement(atualizaQuantidade)) {
			aqtmt.setInt(1, quantidade);
			aqtmt.setString(2, produto);
			aqtmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleta(String produto) {

		String deletaProduto = "delete from produtos where produto = \"" + produto + "\";";

		try (Connection conn = this.conecta(); PreparedStatement delproduto = conn.prepareStatement(deletaProduto)) {
			delproduto.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selecionaProdutos() {
		String sql = "select * from produtos;";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("Produto: " + rs.getString("produto"));
				System.out.println("Quantidade: " + rs.getInt("quantidade"));
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
