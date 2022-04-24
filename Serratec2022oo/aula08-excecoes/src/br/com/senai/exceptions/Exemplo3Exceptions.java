package br.com.senai.exceptions;

public class Exemplo3Exceptions {
	public static void main(String[] args) {
		int vetor[] = {10,30,60};
		int a = 30, b = 0, c = 0;
		String nome = null;
		
		try {
			System.out.println(nome.equals("Vinicius"));
			System.out.println("Vetor posi��o 3:" + vetor[3]);
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Erro de divis�o por zero !");
			e.printStackTrace();//Rastreia o erro
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor fora de faixa !");
			e.printStackTrace();//Rastreia o erro
		} catch(NullPointerException e) {
			System.out.println("Esqueceu da inst�ncia do objeto !");
			e.printStackTrace();//Rastreia o erro

		}
	}
	
}