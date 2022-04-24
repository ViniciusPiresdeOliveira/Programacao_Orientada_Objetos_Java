package org.serratec.model;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setCodigoPessoa(23);
		p1.setNome("Vinicius");
		p1.setAltura(1.76);
		p1.setPeso(82);
		System.out.println(p1.getNome());
		System.out.println(p1.resultado());

	}

}
