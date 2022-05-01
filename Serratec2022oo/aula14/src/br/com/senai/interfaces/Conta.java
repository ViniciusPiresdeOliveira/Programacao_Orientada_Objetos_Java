package br.com.senai.interfaces;

@FunctionalInterface//Essa Interface só tem 1 método abstrato
public interface Conta {

	public void transacao();
	
	default void investimento() {
		System.out.println("Investimento realizado com sucesso !");
	}
}
