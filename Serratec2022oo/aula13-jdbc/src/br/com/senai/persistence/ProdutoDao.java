package br.com.senai.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.interfaces.ProdutoImplements;
import br.com.senai.model.Produto;

public class ProdutoDao implements ProdutoImplements {

	private Connection connection;

	public ProdutoDao() {
		connection = ConnectionFactorySingleton.getConnection();
		
	}
	//Exemplo usado para explicar as transações de banco de dados
	public ProdutoDao(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public List<Produto> listar() {
		List<Produto> produtos = new ArrayList<>();
		try {
			String sql = "select * from produto";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"),rs.getString("descricao"), rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
				produtos.add(produto);
			}
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar");
		}
		return produtos;
	}

	@Override
	public Produto buscar(int codigo) {
		String sql = "select * from produto where codigo_produto=?";
		Produto produto = null;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				produto = new Produto(rs.getInt("codigo_produto"),  rs.getString("nome"),  rs.getString("descricao"),  rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
			}
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao buscar");
		}
		return produto;
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
	public List<Produto> buscaPorNome(String nome) {
		String sql = "select * from produto where nome ilike '" + nome + "%'";
		List<Produto> produtos = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"),
						rs.getString("descricao"), rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
				produtos.add(produto);
			}
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar");
		}
		return produtos;

	}

}
