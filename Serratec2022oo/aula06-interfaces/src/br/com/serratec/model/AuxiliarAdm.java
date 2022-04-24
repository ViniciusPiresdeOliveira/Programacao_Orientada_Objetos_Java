package br.com.serratec.model;

public class AuxiliarAdm extends Auxiliar {

	private String sala;

	public AuxiliarAdm(String nome, double salario, String setor, String sala) {
		super(nome, salario, setor);
		this.sala = sala;
	}
	
	
	@Override
	public void calcularAlgumaCoisa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcularAumentoSalario() {
		// TODO Auto-generated method stub

	}

}
