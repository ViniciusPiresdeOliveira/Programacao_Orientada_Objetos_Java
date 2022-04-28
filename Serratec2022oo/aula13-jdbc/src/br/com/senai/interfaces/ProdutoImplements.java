package br.com.senai.interfaces;

import br.com.senai.model.Produto;

public interface ProdutoImplements extends CrudGenerico<Produto>{

	public String buscaPorNome(String nome);
}
