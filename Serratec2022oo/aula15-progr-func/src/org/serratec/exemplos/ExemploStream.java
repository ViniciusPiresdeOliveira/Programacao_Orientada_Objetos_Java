package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.serratec.model.Aluno;

public class ExemploStream {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Roni", "roni@gmail.com", 46 );
		Aluno a2 = new Aluno(2, "Vinicius", "vini@gmail.com", 18 );
		Aluno a3 = new Aluno(3, "Gabriel", "gabriel@gmail.com", 22 );
		Aluno a4 = new Aluno(4, "Rebeca", "rebeca@gmail.com", 22 );
		Aluno a5 = new Aluno(5, "Cauã", "caua@gmail.com", 18 );
		Aluno a6 = new Aluno(6, "Juliana", "juliana@gmail.com", 30 );

		List<String> cores = Arrays.asList("Preto", "Amarelo", "Verde");
		Stream<String> streamCores = cores.stream();
		streamCores.forEach(c -> System.out.println(c));

		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		Stream<Aluno> streamAlunos = alunos.stream();
		List<String> nomes = streamAlunos.map(a -> a.getNome().substring(0, 3)).collect(Collectors.toList());
		System.out.println(nomes);
	}

}
