package br.com.senai.model;

import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate dataDoPedido;
	private int quantidade;
	private double valor;
	private static double totalPedido = 0.0;
			
		
	
	public Pedido(int numero, LocalDate dataDoPedido, int quantidade, double valor) {
		this.numero = numero;
		this.dataDoPedido = dataDoPedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(LocalDate dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double finalizarPedido() {
		if (dataDoPedido.getDayOfWeek().getValue() == 7){
			totalPedido += quantidade * (valor * 0.9);
			return quantidade * (valor * 0.9);
		} else {
			totalPedido += quantidade * valor;
			return quantidade * valor;
		}
	
		
	}

	public static double getTotalPedido() {
		return totalPedido;
	}
	}

