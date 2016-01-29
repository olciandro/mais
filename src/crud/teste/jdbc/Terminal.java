package crud.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Terminal {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/cadastro";
		String usuario = "root";
		String senha = "";
		
		try(Connection con = DriverManager.getConnection(url, usuario, senha)){
			
			ContaCRUD crud = new ContaCRUD();
			
			Conta conta1 = new Conta(1, "maria", 1800.00);
			System.out.println(crud.ler(con));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*List<Conta> contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(contas);
			}*/
			
			
				
		}

	}

}
