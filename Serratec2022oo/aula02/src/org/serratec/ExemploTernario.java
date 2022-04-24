package org.serratec;

public class ExemploTernario {

	public static void main(String[] args) {
		boolean f = (1 > 5);
		boolean f2 = !(1 > 5);
		System.out.println(f);
		System.out.println(f2);

		int dia = 30;
		if (dia < 30) {
			System.out.println("Mês de Fevereiro");

		} else {
			System.out.println("Outro mês");
		}
		//Exemplo Ternário
		System.out.println(dia > 30 ? "Mês de Fevereiro" : "Outro mês");
	}
}
