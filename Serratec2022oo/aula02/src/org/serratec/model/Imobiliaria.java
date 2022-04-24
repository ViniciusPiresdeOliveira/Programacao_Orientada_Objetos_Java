package org.serratec.model;

public class Imobiliaria {
	String tipoImovel;
	double valorImovel;
	String local;
	
	public void reajustarImovel() {
		if (tipoImovel.equals("Apto")) {
			valorImovel *= 1.10;
		} else {
			valorImovel *= 1.05;
		}
	}
}

