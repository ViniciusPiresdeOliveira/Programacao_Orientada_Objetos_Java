package br.com.senai.persistence;

import br.com.senai.model.Produto;

public class TesteCRUD {

	public static void main(String[] args) {
		//Produto produto = new Produto(5, "Tangerina", "Pokan", 9.0, 100);
		//ProdutoDao dao = new ProdutoDao();
		//dao.atualizar(produto);
		//System.out.println(dao.listar());
		//System.out.println(dao.buscar(1));
		//System.out.println(dao.buscaPorNome("Tangerina"));
		//Produto produto = new Produto(null, "Peixe", "Frescatto", 15.0, 8);
		//ProdutoDao dao = new ProdutoDao();
		//dao.inserir(produto);
		//Produto produto = new Produto(null, "Banana", "D'água", 2.0, 80);
		//ProdutoDao dao = new ProdutoDao();
		//dao.inserir(produto);
		//dao.remover(9);
		Produto produto = new Produto(8, "Biscoito", "Trakinas", 2.0, 140);
		ProdutoDao dao = new ProdutoDao();
		//dao.atualizar(produto);
		//System.out.println(dao.listar());
		//System.out.println(dao.buscar(10));
		System.out.println(dao.buscaPorNome("m"));
		
	}

}
