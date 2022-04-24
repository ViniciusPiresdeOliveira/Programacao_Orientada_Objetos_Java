package br.com.serratec.model;

public class TotalTributos {

	private double total;
	
	public double getTotal() {
		return total;
	}
	
	public void totalizarTributos(Tributos tributos) {
		total += tributos.calcularICMS();
		total += tributos.calculaImpostoDeRenda();
		
		
		//System.out.println(tributos.toString() + " \nICMS: " + tributos.calcularICMS());
		//System.out.println(tributos.toString() + " \nIR: " + tributos.calculaImpostoDeRenda());
		
		
	}
		
		
	}


