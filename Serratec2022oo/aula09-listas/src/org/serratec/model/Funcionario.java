package org.serratec.model;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "------------- Funcionario ------------- \n" + "Nome: " + nome + " || Cargo: " + cargo + " || Sal�rio=" + salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}


	public double getSalario() {
		return salario;
	}

	public double abonoSalario(double valor) {
		return salario += valor;
				
	}
	
}
