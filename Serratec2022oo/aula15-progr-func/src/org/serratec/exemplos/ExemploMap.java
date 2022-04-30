package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploMap {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(20,30,40,60,10);
		numeros.stream().map(a -> a*2).forEach(a -> System.out.println(a));
		
		Stream<Integer> streamNumeros = numeros.stream().map(a -> a*2);
		
		System.out.println("Lista com String para Double");
		List<String> numeros2 = Arrays.asList("90.0", "10.5", "30.5", "40.5", "32.5");
		List<Double> numeros3 = numeros2.stream().map(n -> new Double(n)).collect(Collectors.toList());
		numeros3.forEach(p -> System.out.println(p));
	}

}
