package lista_7.dependencias.DB;

import java.sql.*;

public class UsuariosDB implements InterfaceCIAD {

	private String primeiroNome;
	private String ultimoNome;
	private String nomeUsuario;
	private String email;
	private String senha;
	
	public UsuariosDB() {
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

		String usuario = "create table if not exists usuario("
				+ "id_usuario integer not null primary key autoincrement," + "primeiro_nome varchar(45) not null,"
				+ "ultimo_nome varchar(45) not null," + "senha varchar(45) not null,"
				+ "nome_usuario varchar(45) not null unique," + "email varchar(255) not null unique" + ");";

		try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
			stmt.execute(usuario);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void insere() {
		String usuario = "insert into produtos(primeiro_nome, ultimo_nome, senha, nome_usuario, email) values(?, ?, ?, ?, ?);";
		try (Connection conn = this.conecta(); PreparedStatement pstmt = conn.prepareStatement(usuario)) {
			pstmt.setString(1, primeiroNome);
			pstmt.setString(2, ultimoNome);
			pstmt.setString(3, senha);
			pstmt.setString(4, nomeUsuario);
			pstmt.setString(5, email);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void atualiza() {
		// quem sabe colocar um recuperar senha aqui
	}

	@Override
	public void deleta(int id) {

		// quem sabe colocar uma area para deletar usuario, vai que ele é demitido
	}

}