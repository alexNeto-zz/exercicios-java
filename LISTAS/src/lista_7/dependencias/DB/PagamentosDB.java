package lista_7.dependencias.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lista_7.dependencias.Dados;

public class PagamentosDB extends AtributosComuns implements InterfaceCIAD {

	private final String TABELA = "pagamentos";

	public PagamentosDB() {
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
		String cria = "create table if not exists " + TABELA + "("
				+ "id_" + TABELA + " integer not null primary key autoincrement," + "id_data integer not null,"
				+ "montante decimal(15, 2) not null," + "descricao text,"
				+ "foreign key (id_data) references data(id_data) on update set default" + ");";

		try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
			stmt.execute(cria);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void insere() {
		String insere = "insert into " + TABELA + "(montante, descricao, id_data) values(?, ?, ?);";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(insere)) {
			pstmt.setDouble(1, getMontante());
			pstmt.setString(2, getDescricao());
			pstmt.setInt(3, getData());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public List<Dados> seleciona() {
		
		ArrayList<Dados> dados = new ArrayList<Dados>();
		String sql = "select * from " + TABELA + ";";
		try (Connection conn = this.conecta();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while (rs.next()) {
				Dados dado = new Dados();

				dado.setMontante(rs.getDouble("montante"));
				dado.setDescricao(rs.getString("descricao"));
				//contato.setData(rs.getString("data"));
				dados.add(dado);
			}
		} catch (Exception e) {
		}
		return dados;
	}

	@Override
	public void atualiza() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleta(int id) {
		// TODO Auto-generated method stub

	}

}
