package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoSessao {
	static final String url = "jdbc:postgresql://localhost:5432/Cinema";
	
	public void inserir(int sala, String data, String hora, String filme) {
		String sql = "INSERT INTO sessao (data, hora, filme, sala) VALUES ('" + data + "', '" + hora + "', '" + filme + "', " + sala + ")";
	
		try {
			Connection conexao = DriverManager.getConnection(url, "postgres", "postgres");
			PreparedStatement inclusao = conexao.prepareStatement(sql);
			inclusao.execute();
		}
		catch (SQLException e) {
			System.out.println("Não foi possível acessar o BD");
		}
	}
}