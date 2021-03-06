package exercicio_oficina;

import java.time.LocalDate;

public class Veiculo implements Oficina {

	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "\nModelo do Veiculo: " + modelo + "\nData do Conserto: " + dataConserto + 
				"\nProprietário: " + proprietario + "\nValor Cobrado: R$" + valorCobrado ;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado = TipoServico.LAVAGEM.getTipoServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			valorCobrado = TipoServico.OLEO.getTipoServico() - 50;
		} else {
			valorCobrado = TipoServico.OLEO.getTipoServico();
		}
		return valorCobrado;
	}

	@Override
	public double revisao() {
		if (dataConserto.getMonth().getValue() == 8) {
			valorCobrado = TipoServico.REVISAO.getTipoServico() - TipoServico.REVISAO.getTipoServico() * 0.10;
		} else {
			valorCobrado = TipoServico.REVISAO.getTipoServico();
		}
		return valorCobrado;
	}

}
