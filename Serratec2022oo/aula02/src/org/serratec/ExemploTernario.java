package org.serratec;

public class ExemploTernario {

	public static void main(String[] args) {
		boolean f = (1 > 5);
		boolean f2 = !(1 > 5);
		System.out.println(f);
		System.out.println(f2);

		int dia = 30;
		if (dia < 30) {
			System.out.println("M�s de Fevereiro");

		} else {
			System.out.println("Outro m�s");
		}
		//Exemplo Tern�rio
		System.out.println(dia > 30 ? "M�s de Fevereiro" : "Outro m�s");
	}
}
