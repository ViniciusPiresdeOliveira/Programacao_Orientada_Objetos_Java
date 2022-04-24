package br.com.senai.model;

public class Anestesista extends Medico {
	
	private String tipoAnestesia;

	public Anestesista(String nome, String crm, String nomeMedico, String tipoAnestesia) {
		super(nome, crm, nomeMedico);
		this.tipoAnestesia = tipoAnestesia;
	
		
		}
	@Override
	public String toString() {
		return "Anestesista: " + tipoAnestesia;
	}
	

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	
	
}
