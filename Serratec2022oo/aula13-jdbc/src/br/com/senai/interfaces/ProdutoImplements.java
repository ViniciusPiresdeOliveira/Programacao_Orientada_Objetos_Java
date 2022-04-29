package br.com.senai.interfaces;

import java.util.List;

import br.com.senai.model.Produto;

public interface ProdutoImplements extends CrudGenerico<Produto>{

	public List<Produto> buscaPorNome(String nome);
}
