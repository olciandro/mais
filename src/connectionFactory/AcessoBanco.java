package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	public static void main(String[] args) throws Exception{
		
		String sql = "select codigo, nome, sexo, email from pessoa";
		String url = "jdbc:mysql://localhost:3306/cadastro";
		//String url = "jdbc:oracle:thin:@localhost:8091/pessoa";
		String usuario = "root";
		String senha = "";
		
		try( Connection con = DriverManager.getConnection(url, usuario, senha);
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()){
			System.out.println("deu certo");
			while(rs.next()){
				System.out.println(rs.getString("nome"));
				
			}
		}
		
		


		

	}

}
