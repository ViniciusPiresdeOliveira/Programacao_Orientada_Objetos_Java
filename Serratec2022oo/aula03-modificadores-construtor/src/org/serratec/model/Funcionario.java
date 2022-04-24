package org.serratec.model;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		
	
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
	
	public double calcularINSS() {
		double inss = salario * 0.11;
		return inss;
	}
	
	public double calcularValeTransporte() {
		double valeTransporte = salario * 0.06;
		return valeTransporte;
	}
	
	public double resultado(double inss, double salario) {
		double resultado = inss + salario;
		return resultado;
	
	}
	
	
}
