package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//nome do usuario no banco
	private static final String USUARIO = "root";
	
	//senha do usuario no banco
	private static final String SENHA = "";
	
	//dados do caminho, porta e nome da base de dados pra conexao
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/cadastro";
	
	public static Connection conexaoComBanco() throws Exception{
		
		//carregando a classe
		Class.forName("com.mysql.jdbc.Driver");
		
		//criando conexao com o banco
		Connection con = DriverManager.getConnection(DATABASE_URL,SENHA,USUARIO);
		return con;
	}
	
	public static void main(String[] args) throws Exception{
		//recupera uma conexao com o banco de dados
		Connection con = conexaoComBanco();
		
		if(con != null){
			System.out.println("conexao bem sucedida"+con);
			con.close();
		}
		
	}
	
	/*public Connection getConnection(){
		try{
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/cadastro", "root", "");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}*/
	
	

}
