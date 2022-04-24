package org.serratec.enumeradores;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {

		Proprietario p1 = new Proprietario("Vinicius");
		LocalDate dt1 = LocalDate.now();
		Veiculo carro = new Carro("Golf", 300, dt1, p1, "Esportivo");
		
		System.out.println(carro.toString());
	}

}
