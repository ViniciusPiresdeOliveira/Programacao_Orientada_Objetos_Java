package org.serratec;

public class Casting {

	public static void main(String[] args) {
		double a = 10.5;
		double b = 5;
		double soma = a + b;
		System.out.println("A soma �: " +soma);

		//jeito erradoint c = soma/2;
		int c = (int)soma/2;
		System.out.println(c);
	}

}
