package br.com.senai.exemplos;

import br.com.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta() {
			@Override
			/*Classe Anônima*/public void transacao() {
				System.out.println("Transação efetuada com sucesso !!");
				
			}
			
		};
		/*Lambda*/Conta conta2 = () -> System.out.println("Transação efetuada !");
		
		conta.transacao();
		conta2.transacao();
		conta.investimento();
	}

}
