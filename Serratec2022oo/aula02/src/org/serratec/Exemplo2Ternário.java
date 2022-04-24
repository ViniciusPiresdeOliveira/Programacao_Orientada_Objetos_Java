package org.serratec;

public class Exemplo2Ternário {
	public static void main(String[] args) {
		double n1 = 10, n2 = 0;
		double media = (n1 + n2) / 2;

		System.out.println(media >= 7 ? "Sua média é: " + media + "\nVocê está aprovado !!" 
				: "Sua média é: " + media + "\nVocê está reprovado !!");

	}

}
