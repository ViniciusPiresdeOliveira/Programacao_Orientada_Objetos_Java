package org.serratec.model;

public class Exemplo {
	public static void main(String[] args) {
		
		String nome = "Vin�cius";
		String sobrenome = "Pires";
		int idade = 18;
		double altura = 1.76;
				
		System.out.printf("%s tem %d anos e %.2f metros de altura" ,nome,idade,altura);
		// %s == Vin�cius
		// %d == 18
		// %.2f  == 1.76
		// O n�mero 2 serve para informar a qtd de casas decimais presentes no n�mero
		System.out.printf("\n%s %s" ,nome,sobrenome);
	}
}
