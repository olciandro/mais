package crud.teste.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {
	
	//metodo para fazer o CREATE no banco
	public void criar(Connection con, Conta conta) throws SQLException{
		String sql = "insert into conta values (?,?,?)";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numeroDaConta);
			stm.setString(2, conta.nomeDoCliente);
			stm.setDouble(3, conta.saldoDaConta);
			stm.executeUpdate();
		}
	}
	
	//metodo para fazer o READ(leitura) no banco
	public List<Conta> ler(Connection con) throws SQLException{
		List<Conta> lista = new ArrayList<>();
	
		String sql = "select numeroDaConta, nomeDoCliente, saldoDaConta from conta";
		try(PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				lista.add(new Conta(rs.getInt(1),rs.getString(2), rs.getDouble(3)));
				
			}
			
		}
		
		return lista;
	}
	
	//metodo para fazer o UPDATE no banco 
	public void alterar(Connection con, Conta conta) throws SQLException{
		
		String sql = "update conta set nomeDoCliente=?, saldoDaConta=? where numeroDaConta=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, conta.nomeDoCliente);
			stm.setDouble(2, conta.saldoDaConta);
			stm.setInt(3, conta.numeroDaConta);
			stm.executeUpdate();
		}
	}
	
	//metodo para fazer o DELETE no banco
	public void excluir(Connection con, Conta conta) throws SQLException{
		
		String sql = "delete from conta where numeroDaConta=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numeroDaConta);
			stm.executeUpdate();
		}
	}
	

}
