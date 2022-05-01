package br.com.senai.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author RESIDENCIA
 * @version 1.0
 * 
 * 
 *
 */
public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj;
	private String nome;
	private String email;
	private Double comissao;

	public Fornecedor(String cnpj, String nome, String email, Double comissao) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "\n---------------------- Fornecedor---------------------- " + "\nNome: " + nome + "\nCNPJ: " + cnpj
				+ "\nEmail: " + email + "\nComissão: " + comissao;
	}

	/**
	 * 
	 * @return Retorna o cnpj do Cliente
	 */
	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getComissao() {
		return comissao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

	/**
	 * Método criado para calcular o pagamento dos fornecedores. Na fórmula de
	 * cálculo deverá ser acrescida a comissão.
	 * 
	 * @author RESIDENCIA
	 * @since 29/04/2022
	 * @param valor recebe o valor de entrada do pagamento
	 * @return retorna o valor cáculo do pagamento
	 * @throws caso o valor for negativo o método deverá lançarr uma execeção
	 * 
	 */
	public Double calcularPagamento(double valor) throws IllegalArgumentException {
		return 0.0;
	}

	/**
	 * Este método imprime uma listagem de todos os fornecedores
	 * 
	 * @author RESIDENCIA
	 * @since 39/04/2022
	 *
	 */
	public void listarFornecedores(double valor) {

	}
}
