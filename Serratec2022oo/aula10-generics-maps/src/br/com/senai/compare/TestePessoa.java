package br.com.senai.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Afonso", "12345678900", 87);
		Pessoa p2 = new Pessoa("Zé", "78965412300", 83);
		Pessoa p3 = new Pessoa("Albertina", "45632178900", 89);
		
		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);//Ordena os nomes em ordem alfabética
		System.out.println(pessoas);
		
		
	}

}
