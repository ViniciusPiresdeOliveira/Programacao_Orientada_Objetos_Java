package Exercicios;

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected String turno;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;

		
	}

	@Override
	public String toString() {
		
		return "Nome: " + nome + "\nSalário: " + salario; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario() {
		salario += (salario * 0.02);
		
	}
	
}
