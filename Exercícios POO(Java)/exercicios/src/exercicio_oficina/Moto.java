package exercicio_oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo,dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Cilindradas: " + cilindradas + "\nModelo: " + modelo + "\nValor Cobrado: R$" + valorCobrado
				+ "\nData do Conserto: " + dataConserto + "\nProprietário=" + proprietario;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado = TipoServico.LAVAGEM.getTipoServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		valorCobrado = TipoServico.OLEO.getTipoServico();
		return valorCobrado;
	}

	@Override
	public double revisao() {
		valorCobrado = TipoServico.REVISAO.getTipoServico();
		return valorCobrado;
	}
	
	
}
