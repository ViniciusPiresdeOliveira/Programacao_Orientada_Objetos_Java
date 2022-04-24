package br.com.senai.model;

public class TesteVeiculo {
	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		caminhao.setPlaca("123");
		caminhao.setChassi("56877644");
		caminhao.setCor("Azul");
		caminhao.setValorIPVA(5000);
		caminhao.setCargaMaxima(1000);
		caminhao.adicionarValorIPVA(500);
		
		System.out.println("O valor do IPVA é: "+caminhao.getValorIPVA());
	}
}
