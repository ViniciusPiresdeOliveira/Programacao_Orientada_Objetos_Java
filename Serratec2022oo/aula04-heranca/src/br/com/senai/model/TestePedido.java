package br.com.senai.model;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.of(2022, 04, 12), 4, 12.0);        
		Pedido pedido2 = new Pedido(123, LocalDate.of(2022, 04, 17), 4, 12.0); 
		Pedido pedido3 = new Pedido(123, LocalDate.now(), 6, 10.0); 
			
		System.out.println(pedido1.finalizarPedido());
		System.out.println(pedido2.finalizarPedido());
		System.out.println(pedido3.finalizarPedido());
		System.out.println("Total geral do pedido: "+Pedido.getTotalPedido());
	}

}
