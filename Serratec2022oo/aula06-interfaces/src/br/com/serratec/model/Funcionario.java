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
	//Não tem implementação. Quem vai implementar são as filhas
	//Nesse caso, o Abstract obriga as classes filhas a implementarem este método
	public abstract void calcularAumentoSalario();
	
	
	
}
