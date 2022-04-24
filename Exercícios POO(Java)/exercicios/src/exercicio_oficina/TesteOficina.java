package exercicio_oficina;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {

		Proprietario p1 = new Proprietario("Vinicius");
		Carro c1 = new Carro("Golf", LocalDate.now(), p1, "Esportivo");
		
		c1.trocarOleo();
		c1.revisao();
		
		System.out.println(p1.toString());
		System.out.println(c1.toString());
		
		
		
	}

}
