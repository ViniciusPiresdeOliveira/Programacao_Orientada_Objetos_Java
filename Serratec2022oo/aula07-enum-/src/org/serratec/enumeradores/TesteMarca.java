package org.serratec.enumeradores;

public class TesteMarca {

	public static void main(String[] args) {

		MarcaCelular mc1 = new MarcaCelular(9, "SQL", Marca.APPLE);
		
		System.out.println(mc1);
		
		for (Marca marca : Marca.values()) {
			System.out.println(marca);
		}
	}

}
