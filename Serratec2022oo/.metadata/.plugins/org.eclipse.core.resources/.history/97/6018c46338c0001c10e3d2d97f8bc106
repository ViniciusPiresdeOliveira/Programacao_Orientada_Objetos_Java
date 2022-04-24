package br.com.senai.exceptions;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente("1", "Vinicius", 1000);
		
		try {
			cc.deposito(100);
			cc.saque(2000);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} 
	}

}
