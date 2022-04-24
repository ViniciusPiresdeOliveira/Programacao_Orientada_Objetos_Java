package org.serratec.enumeradores;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Vinicius", "piresvinicius35@gmail.com", Setor.COMPRAS, EstadoCivil.SOLTEIRO);
		System.out.println(p1);
		System.out.println(p1.getSetor().getSala());
		System.out.println(p1.getSetor().ordinal());
		System.out.println(p1.getSetor().valueOf("COMPRAS"));
		
		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil.getValor() + " " +  estadoCivil.ordinal());
		}
	}

}
