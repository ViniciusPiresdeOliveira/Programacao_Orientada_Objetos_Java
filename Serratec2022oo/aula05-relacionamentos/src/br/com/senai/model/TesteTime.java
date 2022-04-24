package br.com.senai.model;

public class TesteTime {

	public static void main(String[] args) {
		
		Atleta atleta1 = new Atleta("Fred", 38, "Centroavante");
		Atleta atleta2 = new Atleta("Cano", 34, "Centroavante");
		Atleta atleta3 = new Atleta("Gum", 38, "Zagueiro");
		
		Time time = new Time("Fluminense", "Abel Braga", new Atleta[3]);
		
		time.inserirAtletas(atleta1);
		time.inserirAtletas(atleta2);
		time.inserirAtletas(atleta3);
		
		System.out.println("Time: " + time.getNomeTime());
		time.listaTime();
	}

}
