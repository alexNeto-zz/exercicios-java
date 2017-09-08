package lista_7.dependencias.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataDB implements InterfaceCIAD {
	
	private int dia;
	private int mes;
	private int ano;

	public DataDB() {
		try (Connection conn = DriverManager.getConnection(URL)) {
			cria();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Connection conecta() {
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

		String data = "create table if not exists data(" + "id_data integer not null primary key autoincrement,"
				+ "dia integer not null," + "mes integer not null," + "ano integer not null" + ");";

		try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
			stmt.execute(data);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void insere() {
		String usuario = "insert into produtos(dia, mes, ano) values(?, ?, ?);";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(usuario)) {
			pstmt.setInt(1, dia);
			pstmt.setInt(2, mes);
			pstmt.setInt(3, ano);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void atualiza() {
		// não pode atualizar o tempo

	}

	@Override
	public void deleta(int id) {
		// não pode deletar o tempo

	}

}
