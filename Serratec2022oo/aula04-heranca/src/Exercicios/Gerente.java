package Exercicios;

public class Gerente extends Funcionario{

	private String setor;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
		
	}

	public String getSetor() {
		return setor;
	}

	public void aumentarSalario() {
		salario += (salario * 0.02) + 200;
		
	}
	
	
}
