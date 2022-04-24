package exercicios;

import java.util.Arrays;

public class Contato {

	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;
	
	@Override
	public String toString() {
		return "Nome: " + nome + "Telefones: " + Arrays.toString(telefones) + " Endereco:" + endereco;
	}
	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void mostrarTelefones(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone;
				return;
			}
		}
	}
	
	public void listaContato() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone: " + telefones[i].getNumero());
		}
	}
}
