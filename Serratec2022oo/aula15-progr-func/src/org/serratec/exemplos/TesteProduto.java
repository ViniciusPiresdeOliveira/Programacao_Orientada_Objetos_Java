package org.serratec.exemplos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.serratec.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Arroz", 100, LocalDate.of(2022, 4, 1));
		Produto p2 = new Produto(2, "Farinha de Trigo", 30, LocalDate.of(2022, 04, 2));
		Produto p3 = new Produto(3, "Macarrão", 20, LocalDate.of(2022, 4, 3));
		Produto p4 = new Produto(4, "Feijão", 120, LocalDate.of(2022, 5, 4));
		Produto p5 = new Produto(5, "Arroz Integral", 12, LocalDate.of(2022, 6, 4));

		
		List<Produto> listaProdutos = Arrays.asList(p1,p2,p3,p4,p5);
		
		//Forma Tradicional
		/*Collections.sort(listaProdutos);
		System.out.println(listaProdutos);
		System.out.println("==============================================");
		*/
		Comparator<Produto> compareQuantidade = (a,b)-> a.getQuantidadeEstoque().compareTo(b.getQuantidadeEstoque());
		Collections.sort(listaProdutos, compareQuantidade);
		listaProdutos.forEach(p -> System.out.println(p));
		System.out.println("==============================================");
		
		Comparator<Produto> compareQuantidade2 = (a,b)-> b.getQuantidadeEstoque().compareTo(a.getQuantidadeEstoque());
		Collections.sort(listaProdutos, compareQuantidade2);
		listaProdutos.forEach(p -> System.out.println(p));
		System.out.println("==============================================");
		
		Comparator<Produto> compareNome = (a,b)-> a.getNome().compareTo(b.getNome());
		Collections.sort(listaProdutos, compareNome);
		listaProdutos.forEach(p -> System.out.println(p));
		System.out.println("==============================================");
		//Outra forma
		listaProdutos.sort((a,b)-> a.getNome().compareTo(b.getNome()));
		listaProdutos.forEach(p -> System.out.println(p));
		
		Comparator<Produto> compareNome2 = (a,b)-> b.getNome().compareTo(a.getNome());
		Collections.sort(listaProdutos, compareNome2);
		listaProdutos.forEach(p -> System.out.println(p));
		System.out.println("==============================================");
		//Outra forma
		listaProdutos.sort((a,b)-> b.getNome().compareTo(a.getNome()));
		listaProdutos.forEach(p -> System.out.println(p));
		
		System.out.println("---------- Filtro pro Produto com (Contains) ----------");
		listaProdutos.stream().distinct().filter(p -> p.getNome().contains("Arroz")).forEach(p -> System.out.println(p));
		System.out.println("---------- Filtro pro Produto com (Equals) ----------");
		listaProdutos.stream().distinct().filter(p -> p.getNome().equals("Arroz")).forEach(p -> System.out.println(p));


	}

}
