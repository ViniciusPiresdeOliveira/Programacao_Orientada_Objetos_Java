package exercicio_oficina;

import java.sql.Date;
import java.time.LocalDate;

public class Carro extends Veiculo {

	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo,dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "\nCategoria: " + categoria + "\nModelo: " + modelo + "\nValor Cobrado: R$" + valorCobrado + "\nData do Conserto: " + dataConserto;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getTipoServico();
		return valorCobrado;
	}
	
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			valorCobrado += TipoServico.OLEO.getTipoServico() - 50;
		} else {
			valorCobrado += TipoServico.OLEO.getTipoServico();
		}
		return valorCobrado;
	}
	
	public double revisao() {
		if (dataConserto.getMonth().getValue() == 8) {
			valorCobrado += TipoServico.REVISAO.getTipoServico() - TipoServico.REVISAO.getTipoServico() * 0.10;
		} else {
			valorCobrado += TipoServico.REVISAO.getTipoServico();
		}
		return valorCobrado;
	}
}
