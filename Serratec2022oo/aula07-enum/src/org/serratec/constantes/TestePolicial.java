package org.serratec.constantes;

public class TestePolicial {

	public static void main(String[] args) {

		Policial p1 = new PolicialFederal("01236547899", "Vinicius", 3500, "Rio de Janeiro", "1");
		Policial p2 = new PolicialFederal("98745632100", "Roni", 2980, "Bras�lia", "2");
		
		System.out.println("Total de Policiais: " + Policial.getTotalPoliciais());
	}

}
