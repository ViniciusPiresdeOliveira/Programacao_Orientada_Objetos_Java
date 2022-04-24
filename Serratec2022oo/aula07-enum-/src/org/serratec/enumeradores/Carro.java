package org.serratec.enumeradores;

import java.time.LocalDate;

public class Carro extends Veiculo{

	private String categoria;

	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Categoria: " + categoria + "Modelo: " + modelo + "Valor cobrado: " + valorCobrado
				+ "Data do conserto: " + dataConserto + "Proprietário: " + proprietario;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		
		return super.lavarVeiculo();
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return super.trocarOleo();
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return super.revisao();
	}
	
	
}
