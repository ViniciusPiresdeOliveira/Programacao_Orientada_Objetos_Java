package br.com.senai.persistence;

import java.sql.Connection;
import br.com.senai.model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(null, "Laranja", "Pera", 3.0, 10);
		Produto p2 = new Produto(null, "Pera", "Portuguesa", 4.0, 50);
		Produto p3 = new Produto(null, "Uva", "Itália", 5.5, 20);
		
		Connection connection = ConnectionFactorySingleton.getConnection();
		
		ProdutoDao dao = new ProdutoDao();
		
	}

}
