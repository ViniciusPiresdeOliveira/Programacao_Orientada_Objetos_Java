package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.serratec.model.Aluno;

public class Exemplo1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Roni", "roni@gmail.com", 46 );
		Aluno a2 = new Aluno(2, "Vinicius", "vini@gmail.com", 18 );
		Aluno a3 = new Aluno(3, "Gabriel", "gabriel@gmail.com", 22 );
		Aluno a4 = new Aluno(4, "Rebeca", "rebeca@gmail.com", 22 );
		Aluno a5 = new Aluno(5, "Cauã", "caua@gmail.com", 18 );
		Aluno a6 = new Aluno(6, "Juliana", "juliana@gmail.com", 30 );

		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		alunos.forEach(a -> System.out.println(a));
		System.out.println("===========================================================================");
		ExibeDados exibeDados = new ExibeDados();
		alunos.forEach(exibeDados);
		
		//Classe Anônima
		Consumer<Aluno> alunoConsumer = new Consumer<Aluno>() {
			@Override
			public void accept(Aluno t) {
				System.out.println(t);
				System.out.println("===========================================================================");

			}
		};
		
		//alunos.forEach(alunoConsumer);
		System.out.println("===========================================================================");
		alunos.forEach(a ->{
			System.out.println(a.getNome());
			System.out.println(a.getIdade());

		});
		System.out.println("===========================================================================");
		System.out.println("Imprimindo com Method Reference !");
		alunos.forEach(System.out::println);
		System.out.println("===========================================================================");

	}

}
