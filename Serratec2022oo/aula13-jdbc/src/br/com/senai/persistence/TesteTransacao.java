package br.com.senai.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.senai.model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(null, "Laranja", "Pera", 3.0, 10);
		Produto p2 = new Produto(null, "Pera", "Portuguesa", 4.0, 50);
		Produto p3 = new Produto(null, "Uva", "Itália", 5.5, 20);
		
		Produto p4= new Produto(null, "Limão", "Taiti", 3.0, 100);
		Produto p5 = new Produto(null, "Queijo", "Ralado", 4.0, 50);
		Produto p6 = new Produto(null, "Maminha", "Friboi", 25.0, 20);
		
		Connection connection = ConnectionFactorySingleton.getConnection();
		try {
			connection.setAutoCommit(false);
			ProdutoDao dao = new ProdutoDao(connection);
			dao.inserir(p1);
			dao.inserir(p2);
			dao.inserir(p3);
			dao.inserir(p4);
			dao.inserir(p5);
			dao.inserir(p6);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		 
	}

}
