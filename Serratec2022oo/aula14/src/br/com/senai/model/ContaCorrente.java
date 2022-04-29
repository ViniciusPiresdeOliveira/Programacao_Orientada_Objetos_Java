package br.com.senai.model;

import br.com.senai.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void investimento() {
		System.out.println("Investimento em CDB realizado com sucesso !");
	}
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.investimento();
	}
}	
