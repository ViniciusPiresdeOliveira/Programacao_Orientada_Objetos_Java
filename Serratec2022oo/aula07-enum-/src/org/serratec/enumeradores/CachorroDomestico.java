package org.serratec.enumeradores;

import java.time.LocalDate;

public class CachorroDomestico extends Mamifero implements AnimalDomestico {

	private boolean cadastro;

	public CachorroDomestico(String nome, LocalDate dataVacinacao, String raca, boolean cadastro) {
		super(nome, dataVacinacao, raca);
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "CachorroDomestico: " + cadastro + "Ra?a: " + raca + "Nome: " + nome + "Data da vacina??o: "
				+ dataVacinacao;
	}

	public boolean isCadastro() {
		return cadastro;
	}

	@Override
	public void amamentar() {

	}

	@Override
	public boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String emitirSom() {
		return null;
	}

}
