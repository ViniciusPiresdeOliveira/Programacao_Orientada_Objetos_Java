package org.serratec.exemplos;

import java.util.function.Consumer;

import org.serratec.model.Aluno;

public class ExibeDados implements Consumer<Aluno>{

	@Override
	public void accept(Aluno t) {
		//System.out.println(t.getNome());
		//System.out.println(t.getEmail());
		//System.out.println(t.getIdade());
		System.out.println(t);
		
	}

}
