package crud.teste.jdbc;

public class Conta {
	
	int numeroDaConta;
	String nomeDoCliente;
	double saldoDaConta;
	 
	
	public Conta(int numero, String nome, double saldo){
		this.numeroDaConta = numero;
		this.nomeDoCliente = nome;
		this.saldoDaConta = saldo;
	}
	
	
	@Override
	public String toString(){
		return numeroDaConta + "," + nomeDoCliente + "," + saldoDaConta;
	}

	
	
}
