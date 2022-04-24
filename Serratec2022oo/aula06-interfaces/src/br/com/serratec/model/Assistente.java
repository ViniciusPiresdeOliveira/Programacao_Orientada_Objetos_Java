package br.com.serratec.model;

public class Assistente extends Funcionario {

	private String categoria;
	
	public Assistente(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Assistente: " + categoria + "Nome: " + nome + "Sal�rio: " + salario;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public void calcularAumentoSalario() {
		salario = (salario * 1.10) + 100;

	}

}
