package org.serratec.model;

public class TestarImobiliaria {

	public static void main(String[] args) {
		Imobiliaria i1 = new Imobiliaria();
		i1.tipoImovel = "Apto";
		i1.valorImovel = 55800;
		i1.local = "Centro";
		
		i1.reajustarImovel();
		System.out.println("Valor reajustado é: R$" + i1.valorImovel);
	}

}
