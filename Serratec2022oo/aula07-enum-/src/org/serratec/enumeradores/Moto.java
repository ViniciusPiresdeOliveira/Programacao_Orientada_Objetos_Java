package org.serratec.enumeradores;

import java.time.LocalDate;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Cilindradas: " + cilindradas + "\nModelo: " + modelo + "Valor cobrado: " + valorCobrado
				+ "Data do conserto: " + dataConserto + "Proprietário: " + proprietario;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado += lavarVeiculo() + 50; 
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		valorCobrado += trocarOleo() + 100;
		return valorCobrado;
	}

	@Override
	public double revisao() {
		valorCobrado += revisao() + 200;
		return valorCobrado;
	}

}
