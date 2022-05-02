package br.com.senai.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.senai.model.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		Autor a1 = new Autor("Sandro", "22349087");
		Autor a2 = new Autor("Carla", "22351086");
		
		List<Autor> autores = Arrays.asList(a1,a2);
		
		Consumer<Autor> exemploLambda = a -> a.imprimir();
		autores.forEach(exemploLambda);
		
		System.out.println("=========================");
		
		Consumer<Autor> exemploMethodReference = Autor::imprimir;
		autores.forEach(exemploMethodReference);
		
		System.out.println("============ Method Reference(em uma linha) ============");

		autores.forEach(Autor::imprimir);


	}

}
