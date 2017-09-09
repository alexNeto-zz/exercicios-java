package lista_7.dependencias.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class DataDB implements InterfaceCIAD {

	private int dia;
	private int mes;
	private int ano;

	public DataDB() {
		Calendar cal = Calendar.getInstance();
		dia = cal.get(Calendar.DAY_OF_MONTH);
		mes = cal.get(Calendar.MONTH);
		ano = cal.get(Calendar.YEAR);
		try (Connection conn = DriverManager.getConnection(URL)) {
			cria();
			insere();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public String dataFormatada() {
		return dia + "/" + mes + "/" + ano;
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
	public int idAtual() {
		String sql = "select * from data order by id_data desc limit 1";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
				return rs.getInt("id_data");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return 0;
		}		
	}
	public boolean verificaDataRepetida() {
		String sql = "select * from data order by id_data desc limit 1;";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			if (rs.getInt(2) == dia && rs.getInt(3) == mes && rs.getInt(4) == ano) {
				//System.out.println(rs.getRow());
				return false;
				//System.out.println(rs.getInt("id_data"));
				// System.out.println(rs.getRowId(1));
				// System.out.println(rs.getInt("id_data"));
			}
			else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return true;
		}
	}

	@Override
	public void insere() {
		if (verificaDataRepetida()) {
			String usuario = "insert into data(dia, mes, ano) values(?, ?, ?);";
			try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(usuario)) {
				pstmt.setInt(1, dia);
				pstmt.setInt(2, mes);
				pstmt.setInt(3, ano);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
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
