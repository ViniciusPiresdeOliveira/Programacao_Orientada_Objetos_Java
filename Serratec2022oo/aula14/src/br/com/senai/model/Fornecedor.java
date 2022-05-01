package br.com.senai.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Vinicius
 * @version 1.0
 * @since criada em 29 de abril de 2022
 *
 */
public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Cadastro único das empresas junto a Receita Federal
	 */
	private String cnpj;
	private String nome;
	private String email;
	/**
	 * Todo vendedor recebe 1% de comissão
	 */
	private Double comissao;
	/**
	 * Construtor com todos atributos de Fornecedor
	 * @param cnpj
	 * cnpj
	 * @param nome
	 * nome
	 * @param email
	 * email
	 * @param comissao
	 * comissao
	 */
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
	 * @return
	 * Retorna o CNPJ do cliente
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

	/** Método criado para calcular o pagamento dos fornecedores.
	 * Na fórmula de cáculo deverá ser acrescida a comissão.
	 * @author Vinicius
	 * @since 29/04/2022
	 * @param valor recebe o valor de entrada do pagamento.
	 * @return retorna o valor do cálculo de entrada do pagamento.
	 * @throws IllegalArgumentException caso o valor for negativo o método deverá lançar uma excessão
	 */
	public Double calcularPagamento(double valor) throws IllegalArgumentException {
		return 0.0;
	}

	/**
	 * Este método imprime uma listagem de todos os fornecedores.
	 * @author Vinicius 
	 * @since 29/04/2022
	 * @param valor
	 * valor
	 */
	public void listarFornecedores(double valor) {

	}
}
