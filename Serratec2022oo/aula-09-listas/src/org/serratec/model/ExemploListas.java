package org.serratec.model;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {
		
		List lista = new ArrayList<>();
		lista.add("Celular");
		lista.add("TV 42");
		lista.add("Kindle");
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println("=============");
		System.out.println(lista.remove(0) + " foi removido");
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println("=============");
		System.out.println(lista);
		System.out.println(lista.get(1) + " est� na posic�o 1 da Lista");
		System.out.println("=============");
		lista.set(0, "TV 43");//TV 43 foi adicionada na lista
		
		
		for (Object object : lista) {
			System.out.println(object);
			
		}
	}

}
