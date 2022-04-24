package br.com.senai.model;

public class Medico extends Plano {

	protected String crm;
	protected String nomeMedico;

	public Medico(String nome, String crm, String nomeMedico) {
		super(nome);
		this.crm = crm;
		nome = nomeMedico;
	}

	@Override
	public String toString() {

		return super.toString() + "\nCRM: " + crm + "\nNome: " + nomeMedico;
	}
	
	

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() * 1.10;
		return valorPago;
	}
}
