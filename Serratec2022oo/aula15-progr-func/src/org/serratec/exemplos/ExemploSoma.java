package org.serratec.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploSoma {

	public static void main(String[] args) {
		/*Calculo calculo = new Calculo() {
			
			@Override
			public int operacao(int a, int b) {
				return a + b;
			}
		};
		System.out.println("Resultado da soma é: " + calculo.operacao(5, 50));
	}
	//Calculo calculo = (a ,b) -> a + b;
	//System.out.println("Resultado da soma é: " + calculo.operacao(5, 50));*/
		List<String> lista = new ArrayList<>();
		lista.add("Celular");
		lista.add("TV");
		lista.add("Computador");
		
		lista.forEach(a-> System.out.println(a));
		System.out.println("-----------");
		lista.forEach(System.out::println);
	}
}
