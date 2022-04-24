package br.com.senai.model;

public class TesteMedico {

	public static void main(String[] args) {
		
		Anestesista anestesista = new Anestesista("123", "Vinícius", 220, 1000);
		
		System.out.println(anestesista.toString());
	}

}
