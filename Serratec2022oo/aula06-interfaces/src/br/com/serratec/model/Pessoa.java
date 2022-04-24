package br.com.serratec.model;

public abstract class Pessoa {

	protected String nome;
	protected String endereco;
	protected double rendimentos;
	
	public Pessoa(String nome, String endereco, double rendimentos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.rendimentos = rendimentos;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public double getRendimentos() {
		return rendimentos;
	}
	
	
}
