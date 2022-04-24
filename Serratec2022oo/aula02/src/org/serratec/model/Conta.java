package org.serratec.model;

public class Conta {
	String titular;
	int numero;
	double saldo;

	// Método sem retorno
	public void depositar(double valor) {
		saldo += valor;
	}

	// Método com retorno
	public boolean saque(double valor) {
		if (valor > saldo) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
}