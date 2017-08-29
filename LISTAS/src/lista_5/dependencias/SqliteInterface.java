package lista_5.dependencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteInterface {

	public SqliteInterface() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:agenda.db";
			conn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
