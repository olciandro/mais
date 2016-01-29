package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/cadastro";
		String usuario = "root";
		String senha = "";
		String sql = "insert into pessoa values(1 ,'jose', 'M', 'olciandro@hotmail.com')";
		
		try(Connection con = DriverManager.getConnection(url, usuario, senha);
		PreparedStatement stm = con.prepareStatement(sql)){
	    stm.executeUpdate();
		}

	}

}
