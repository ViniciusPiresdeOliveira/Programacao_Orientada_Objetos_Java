package org.serratec.model;

import java.util.ArrayList;
import java.util.List;


public class TestePessoa {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Vinicius", "piresvinicius35@gmail.com", 18);
		Pessoa p2 = new Pessoa("Augusto", "augustojose35@gmail.com", 78);
		Pessoa p3 = new Pessoa("Z�", "ze@gmail.com", 58);
		Cliente c1 = new Cliente("Vinicius");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		//pessoas.add(c1);

		//pessoas.addAll(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
