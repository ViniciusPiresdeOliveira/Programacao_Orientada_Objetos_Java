package org.serratec.model;

public class Fornecedor {
	
	private String cnpj;
	private String razaoSocial;
	private String telefone;
	//Contador pertence aos objetos(f1, f2, f3) que são instanciados.
	//Não partence à classe(Fornecedor).
	private static int contador;
	//Uma variável Static não pertence mais aos objetos(f1, f2, f3), e sim a classe(Fornecedor).
	public Fornecedor(String cnpj, String razaoSocial, String telefone) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
		contador++;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static int getContador() {
		return contador;
	}

	
	}
	
	

