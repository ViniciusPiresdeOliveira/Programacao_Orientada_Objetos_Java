package org.serratec.model;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("55598879879552", "Mc'Donalds", "2498823-8881");
		Fornecedor f2 = new Fornecedor("78467579754211", "Netshoes", "242265-5578");
		Fornecedor f3 = new Fornecedor("55887555462211", "Centauro", "245569-9885");
		Fornecedor f4 = new Fornecedor("12255656878564", "Carrefour", "212565-7845");
		
		System.out.println(f1.getRazaoSocial());
		System.out.println(f2.getRazaoSocial());
		System.out.println(f3.getRazaoSocial());
		System.out.println(f4.getRazaoSocial());
		
		System.out.println("O número total de fornecedores é: " + Fornecedor.getContador());
		
	}

}
