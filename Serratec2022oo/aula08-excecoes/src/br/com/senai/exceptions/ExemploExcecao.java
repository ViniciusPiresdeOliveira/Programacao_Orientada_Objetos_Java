package br.com.senai.exceptions;

import java.util.Scanner;

public class ExemploExcecao {

	//throws ---> passa o erro adiante
	public static int divisao(int i, int j) throws ArithmeticException{
			return i/j;
			//throw new ArithmeticException("Digite um n�mero diferente de ZERO !");	
	}
	public static void main(String[] args) {
		int a, b;
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o primeiro n�: ");
			a = sc.nextInt();
			
			System.out.println("Digite o segundo n�: ");
			b = sc.nextInt();
			
			System.out.println("O resultado �: " + divisao(a,b));
		} catch (ArithmeticException e) {
			System.out.println("Erro de divis�o por zero");
			System.out.println(e.getMessage());
		}

	}

}
