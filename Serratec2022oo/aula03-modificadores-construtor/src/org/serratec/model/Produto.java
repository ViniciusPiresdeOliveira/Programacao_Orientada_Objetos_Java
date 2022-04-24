package org.serratec.model;

public class Produto {
	
	private int codProduto;
	private String descricao;
	private double valor;
	
	public Produto(int codigo, String descricao, double valor) {
		this.codProduto = codigo;
		this.descricao = descricao;
		this.valor = valor;
		System.out.println("Construtor cheio");
	}
	
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
