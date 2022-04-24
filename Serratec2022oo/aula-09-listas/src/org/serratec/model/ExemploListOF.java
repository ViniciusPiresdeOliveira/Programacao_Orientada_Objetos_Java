package org.serratec.model;

import java.util.List;

public class ExemploListOF {

	public static void main(String[] args) {
		
		List listaImutavel = List.of("TV 43", "Kindle", "Celular");
		/* Restrições do List.of();
		 * lista.add("Som");
		 * lista.remove(0);
		 * lista.set(0,"Som");
		 */
		
		for (Object object : listaImutavel) {
			System.out.println(object);
		}
		

	}

}
