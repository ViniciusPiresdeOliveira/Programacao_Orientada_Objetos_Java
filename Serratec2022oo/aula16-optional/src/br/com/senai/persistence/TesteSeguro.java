package br.com.senai.persistence;

import java.util.Optional;

import br.com.senai.model.Carro;
import br.com.senai.model.Seguro;

public class TesteSeguro {

	public static void main(String[] args) {
		Seguro seguro1 = new Seguro("Parcial", 1200.);
		Seguro seguro2 = new Seguro("Total", 2500.);
		Carro carro1 = new Carro("Vw", "Golf", 55000., Optional.of(seguro1));
		Carro carro2 = new Carro("Vw", "Jetta", 50000., Optional.ofNullable(null));

		String cobertura = carro2.getSeguro().map(Seguro::getCobertura).orElse("Não tem cobertura");
		Optional<Double> valorSeguro = carro1.getSeguro().map(Seguro::getValorSeguro);
		
		System.out.println(valorSeguro.get());
		System.out.println(cobertura);
		
		System.out.println(carro1);
		System.out.println(carro2);
				
	}

}
