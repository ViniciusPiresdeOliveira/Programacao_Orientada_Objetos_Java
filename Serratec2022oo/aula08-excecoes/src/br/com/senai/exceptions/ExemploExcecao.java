package br.com.senai.exceptions;

import java.util.Scanner;

public class ExemploExcecao {

	//throws ---> passa o erro adiante
	public static int divisao(int i, int j) throws ArithmeticException{
			return i/j;
			//throw new ArithmeticException("Digite um número diferente de ZERO !");	
	}
	public static void main(String[] args) {
		int a, b;
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o primeiro nº: ");
			a = sc.nextInt();
			
			System.out.println("Digite o segundo nº: ");
			b = sc.nextInt();
			
			System.out.println("O resultado é: " + divisao(a,b));
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero");
			System.out.println(e.getMessage());
		}

	}

}
