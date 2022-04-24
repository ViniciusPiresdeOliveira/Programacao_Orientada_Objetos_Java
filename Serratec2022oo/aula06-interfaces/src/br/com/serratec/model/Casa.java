package br.com.serratec.model;

public class Casa extends Imovel {

	private boolean garagem;

	public Casa(String local, double valor, boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}
	@Override
	public String toString() {
		return super.toString() + (garagem? "\nCasa tem garagem" : "\nCasa não tem garagem");
	}
	
	public boolean isGaragem() {
		return garagem;
	}

	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}
	
	
}
