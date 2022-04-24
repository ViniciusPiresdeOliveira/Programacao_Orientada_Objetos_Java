package br.com.serratec.model;

public class Corrente implements Conta {

	private double saldo;
	private double taxa;
	
	
	@Override
	public void saque(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor - taxa;
		}

	}

	@Override
	public void deposito(double valor) {
		saldo += valor;

	}

}
