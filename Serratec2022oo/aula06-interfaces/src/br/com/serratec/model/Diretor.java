package br.com.serratec.model;

public class Diretor extends Funcionario {

	private String tipo;

	public Diretor(String nome, double salario, String tipo) {
		super(nome, salario);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Diretor: " + tipo + "\nNome: " + nome + "Salário: " + salario;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void calcularAumentoSalario() {
		salario = salario * 1.15;

	}

}
