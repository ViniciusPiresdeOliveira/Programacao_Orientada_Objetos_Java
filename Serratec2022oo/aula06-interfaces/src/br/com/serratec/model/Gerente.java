package br.com.serratec.model;

public class Gerente extends Funcionario {

	private String nivel;

	public Gerente(String nome, double salario, String nivel) {
		super(nome, salario);
		this.nivel = nivel;
	}
	
	@Override
	public String toString() {
		return "Gerente: " + nivel + "Nome: " + nome + "Sal?rio: " + salario;
	}

	public String getNivel() {
		return nivel;
	}

	@Override
	public void calcularAumentoSalario() {
		salario = salario * 1.10;

	}

}
