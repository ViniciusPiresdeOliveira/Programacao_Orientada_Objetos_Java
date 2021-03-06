package org.serratec.model;

import java.util.Arrays;
import java.util.List;

public class ExemploDiferencasArraysListOF {

	public static void main(String[] args) {
		String[] carros = {"Golf", "Fusca", "Gol"};
		List listaCarros = Arrays.asList(carros);//Passei o vetor "carros" para a lista "listaCarros"
		
		listaCarros.set(1, "Fox");
		carros[2] = "KA";
		
	
		for (Object object : listaCarros) {
			System.out.println(object);
		}
		System.out.println("=============");
		String[] cores = {"Vermelho", "Azul", "Amarelo"};
		List lista = List.of(cores);
		cores[0] = "Preto";
		System.out.println(lista);
	}

}
