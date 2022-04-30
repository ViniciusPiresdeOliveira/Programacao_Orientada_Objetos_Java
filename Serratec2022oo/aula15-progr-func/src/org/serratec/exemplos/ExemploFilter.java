package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;

import org.serratec.model.Aluno;

public class ExemploFilter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Roni", "roni@gmail.com", 46 );
		Aluno a2 = new Aluno(2, "Vinicius", "vini@gmail.com", 18 );
		Aluno a3 = new Aluno(3, "Gabriel", "gabriel@gmail.com", 22 );
		Aluno a4 = new Aluno(4, "Rebeca", "rebeca@gmail.com", 22 );
		Aluno a5 = new Aluno(5, "Cauã", "caua@gmail.com", 18 );
		Aluno a6 = new Aluno(6, "Juliana", "juliana@gmail.com", 30 );
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		System.out.println("============== Filtro por idade ==============\n");
		alunos.stream().filter(a -> a.getIdade() >= 30).forEach(a -> System.out.println(a));
		System.out.println("\n============== Filtro por Letra Inicial ==============\n");
		alunos.stream().filter(a -> a.getNome().startsWith("V")).forEach(a -> System.out.println(a));
		System.out.println("\n============== Filtro por Letra Entre ==============\n");
		alunos.stream().filter(a -> a.getNome().contains("a")).forEach(a -> System.out.println(a));
		System.out.println("\n============== Filtro por Letra final ==============\n");
		alunos.stream().filter(a -> a.getNome().endsWith("s")).forEach(a -> System.out.println(a));
		System.out.println("\n============== Ignora o 1º Elemento ==============\n");
		alunos.stream().skip(1).forEach(a -> System.out.println(a));
		System.out.println("\n============== Limita o resultado ==============\n");
		alunos.stream().limit(1).forEach(a -> System.out.println(a));
		
	}

}
