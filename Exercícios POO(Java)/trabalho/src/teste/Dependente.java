package teste;

import pacote_enum.TipoParentesco;

public class Dependente extends Pessoa {

	private TipoParentesco tipoParentesco;

	public Dependente(String nome, int cpf, int dataNascimento, TipoParentesco tipoParentesco) {
		super(nome, cpf, dataNascimento);
		this.tipoParentesco = tipoParentesco;
	}

	@Override
	public String toString() {
		return "Dependente [tipoParentesco=" + tipoParentesco + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + "]";
	}

	public TipoParentesco getTipoParentesco() {
		return tipoParentesco;
	}
}
