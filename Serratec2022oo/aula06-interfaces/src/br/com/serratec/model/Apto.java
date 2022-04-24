package br.com.serratec.model;

public class Apto extends Imovel {

	private int andar;
	private int numero;

	public Apto(String local, double valor, int andar,int numero) {
		super(local, valor);
		this.andar = andar;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return super.toString() + "\nAndar: " + andar + "\nNº: " + numero;
	}
	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	
}
