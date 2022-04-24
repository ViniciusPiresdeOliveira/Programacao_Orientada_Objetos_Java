package br.com.senai.model;

public class Anestesista extends Medico {
	
	private double valorAnestesia;

	public Anestesista(String crm, String nome, double valorConsulta, double valorAnestesia) {
		super(crm, nome, valorConsulta);
		this.valorAnestesia = valorAnestesia;
	}

	public double getValorAnestesia() {
		return valorAnestesia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nValor da Anestesia: R$" + valorAnestesia;
	}
	
}
