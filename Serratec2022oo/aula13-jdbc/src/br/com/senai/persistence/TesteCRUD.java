package br.com.senai.persistence;

import br.com.senai.model.Produto;

public class TesteCRUD {

	public static void main(String[] args) {
		Produto produto = new Produto(5, "Tangerina", "Pokan", 9.0, 100);
		ProdutoDao dao = new ProdutoDao();
		dao.atualizar(produto);
		
	}

}
