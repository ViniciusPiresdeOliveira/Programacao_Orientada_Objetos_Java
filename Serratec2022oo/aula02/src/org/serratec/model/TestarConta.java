package org.serratec.model;

public class TestarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Vinícius";
		conta1.saldo = 1000;

		conta1.depositar(100);
		System.out.println("Depósito efetuado com sucesso !!");
		System.out.println("Atualmente você tem R$" +conta1.saldo + " de saldo");

		Conta conta2 = new Conta();
		conta2.numero = 321;
		conta2.titular = "Ana Claudia";
		conta2.saldo = 2000;

		if (conta2.saque(4200)) {
			System.out.println("Saque efetuado com sucesso !!");
			System.out.println("Atualmente você tem R$" + conta2.saldo + " de saldo");
		} else {
			System.out.println("Saque não efetuado !!");
			System.out.println("Atualmente você tem R$" + conta2.saldo + " de saldo");
		}

	}

}
