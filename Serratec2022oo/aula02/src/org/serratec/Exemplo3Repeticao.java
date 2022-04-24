package org.serratec;

public class Exemplo3Repeticao {

	public static void main(String[] args) {
		int  contador = 1;
		for (contador = 1; contador <= 10; contador++) {
			
			if (contador >= 5 && contador <= 6) {
				continue;
			}
			System.out.println(contador);
		}

	}
}
