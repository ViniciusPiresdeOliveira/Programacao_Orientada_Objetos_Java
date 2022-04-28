package br.com.senai.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import br.com.senai.interfaces.ProdutoImplements;
import br.com.senai.model.Produto;

public class ProdutoDao implements ProdutoImplements {

	private Connection connection;

	public ProdutoDao() {
		connection = ConnectionFactorySingleton.getConnection();
	}

	@Override
	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(int codigo) {
		try {
			String sql = "delete from produto where codigo_produto = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao gravar registro de produto !");
			e.printStackTrace();

		}
	}

	@Override
	public void inserir(Produto produto) {
		try {
			String sql = "insert into produto(nome,descricao,preco,quantidade_estoque) values(?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getQuantidadeEstoque());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao gravar registro de produto !");
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(Produto produto) {
		try {
			String sql = "update produto set nome = ?, descricao = ?, preco = ?, quantidade_estoque = ? where codigo_produto = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getQuantidadeEstoque());
			stmt.setInt(5, produto.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao gravar registro de produto !");
			e.printStackTrace();
		}

	}

	@Override
	public String buscaPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
