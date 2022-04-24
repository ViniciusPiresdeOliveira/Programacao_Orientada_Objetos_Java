package br.com.senai.model;

public class TesteImovel {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("17256978422", "Vinicius", "piresvinicius35@gmail.com");
		Pessoa pessoa2 = new Pessoa("15478962456", "Roberto", "robertooutlook.com");
		Imovel imovel = new Imovel("Casa", 350000, pessoa);
		
		System.out.println("Imóvel: " + imovel.getTipo() + "\nValor: R$" + imovel.getValor() + "\nDono: " + imovel.getDono().getNome());
	}

}
