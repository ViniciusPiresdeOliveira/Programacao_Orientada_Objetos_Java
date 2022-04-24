package br.com.serratec.model;

public class PessoaFisica extends Pessoa implements Tributos {

	private String cpf;
	
	public PessoaFisica(String nome, String endereco, double rendimentos, String cpf) {
		super(nome, endereco, rendimentos);
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "PessoaFisica [rendimentos=" + rendimentos + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	@Override
	public double calculaImpostoDeRenda() {
		return rendimentos * irendaPessoaFisica;
	}
	@Override
	public double calcularICMS() {
		return 0;
	}

}
