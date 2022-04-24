package br.com.serratec.model;

public class TesteImovel {

	public static void main(String[] args) {
		Imovel apto = new Apto("Centro", 250000, 2, 33);
		Imovel casa = new Casa("Itaipava", 370000, true);

		Proprietario p1 = new Proprietario("Ana", apto);
		Proprietario p2 = new Proprietario("Vinicius", casa);
		
		System.out.println("Proprietário: " + p1.getNome());
		System.out.println(p1.getImovel());
		System.out.println("============================");
		System.out.println("Proprietário: " + p2.getNome());
		System.out.println(p2.getImovel());
	}

}
