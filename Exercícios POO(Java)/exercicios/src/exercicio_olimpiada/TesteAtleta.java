package exercicio_olimpiada;

public class TesteAtleta {

	public static void main(String[] args) {

		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("Inglaterra");
		Atleta atleta1 = new Atleta("Gabriel Medina", 72, pais1);
		Atleta atleta2 = new Atleta("Phil Foden" , 59, pais2);
		Atleta atleta3 = new Atleta("Neymar Jr", 71, pais1);
		

		System.out.println(atleta1 + " " + atleta1.verificaSituacao());
		System.out.println(atleta2 + " " + atleta2.verificaSituacao());
		System.out.println(atleta3 + " " + atleta3.verificaSituacao());
		
		System.out.println("Total de participantes :" + atleta1.getTotalParticipantes());
		
	}
}
