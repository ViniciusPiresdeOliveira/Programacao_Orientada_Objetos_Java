package exercicio_time;

import java.util.ArrayList;

public class TesteAtleta {

	public static void main(String[] args) {
		ArrayList<Atleta> listaAtletas = new ArrayList<Atleta>();
		
		listaAtletas.add(new Atleta("F?bio", 41, "Goleiro"));
		listaAtletas.add(new Atleta("Calegari", 20, "Ala Direito"));
		listaAtletas.add(new Atleta("Nino", 25, "Zagueiro"));
		listaAtletas.add(new Atleta("Felipe Melo", 38, "Zagueiro"));
		listaAtletas.add(new Atleta("David Braz", 34, "Zagueiro"));
		listaAtletas.add(new Atleta("Cris Silva", 28, "Ala Esquerda"));
		listaAtletas.add(new Atleta("Andr?", 20, "1? volante"));
		listaAtletas.add(new Atleta("Yago", 27, "2? volante"));
		listaAtletas.add(new Atleta("Ganso", 32, "Meia"));
		listaAtletas.add(new Atleta("?rias", 24, "Segundo Atacante"));
		listaAtletas.add(new Atleta("Cano", 34, "Atacante"));
		
		Time time1 = new Time("Fluminense", "Abel Braga", "Paulo Angioni", listaAtletas, "M?rio Bittencourt", "Marc?o");
		System.out.println(time1);
		
		
		
		
		
		

	}

}
