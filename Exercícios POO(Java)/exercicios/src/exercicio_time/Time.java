package exercicio_time;

import java.util.ArrayList;

public class Time {

	private String nomeTime;
	private String tecnico;
	private String diretor;
	private String presidente;
	private String vp;
	private String auxiliarTecnico;
	private ArrayList<Atleta> atleta;
	
	public Time(String nomeTime, String tecnico, String diretor, ArrayList<Atleta> atleta, String presidente, String auxiliarTecnico) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.presidente = presidente;
		this.auxiliarTecnico = auxiliarTecnico;
		this.setAtleta(atleta);
	}
	

	@Override
	public String toString() {
		return "\nTime: " + nomeTime + "\nDiretoria --------> " + "Presidente: " + presidente + " - " + "Diretor: " + diretor + "\nComiss?o T?cnica: --------> " + "T?cnico: " + tecnico + " - " + "Auxiliar T?cnico: " + auxiliarTecnico + "\n===========================" + "\nAtletas " + atleta;
	}


	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public ArrayList<Atleta> getAtleta() {
		return atleta;
	}

	public void setAtleta(ArrayList<Atleta> atleta) {
		this.atleta = atleta;
	}


	public String getVp() {
		return vp;
	}


	public void setVp(String vp) {
		this.vp = vp;
	}


	public String getAuxiliarTecnico() {
		return auxiliarTecnico;
	}


	public void setAuxiliarTecnico(String auxiliarTecnico) {
		this.auxiliarTecnico = auxiliarTecnico;
	}
	
}
