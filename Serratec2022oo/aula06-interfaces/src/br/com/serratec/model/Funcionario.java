package br.com.serratec.model;

public abstract class Funcionario {

	protected String nome;
	protected double salario;
	
	
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return "Funcionario " + nome + "salario " + salario;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//N�o tem implementa��o. Quem vai implementar s�o as filhas
	//Nesse caso, o Abstract obriga as classes filhas a implementarem este m�todo
	public abstract void calcularAumentoSalario();
	
	
	
}
