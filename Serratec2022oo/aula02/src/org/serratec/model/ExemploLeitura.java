package org.serratec.model;

import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("A soma entre " + a + " e " + b + " é: " + (a + b));
		
		sc.close();
	}

}

