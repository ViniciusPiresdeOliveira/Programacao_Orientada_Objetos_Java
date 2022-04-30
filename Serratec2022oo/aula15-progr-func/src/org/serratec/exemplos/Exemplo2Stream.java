package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo2Stream {

	public static void main(String[] args) {
		List<Double> numeros = Arrays.asList(10.5, 50.0, 30.3, 11.8, 12.4,11.2,11.2);
		numeros.stream().distinct().forEach(a -> System.out.println(a));
		System.out.println("=============");
		numeros.stream().sorted().forEach(a -> System.out.println(a));
		System.out.println("=============");
		numeros.stream().distinct().sorted().forEach(a -> System.out.println(a));
		System.out.println("=============");
		
	}

}
