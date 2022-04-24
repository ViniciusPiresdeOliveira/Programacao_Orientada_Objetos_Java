package exericicio_venda;

import java.time.LocalDate;

public class Teste_Venda {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "TV", 2599.99, Categoria.ELETRONICO);
		Produto p2 = new Produto(2, "Chocolate", 3.99, Categoria.ALIMENTO);
		Produto p3 = new Produto(3, "Camisa Nike", 79.99, Categoria.ROUPAS);
		
		Venda v1 = new Venda(p1, LocalDate.now(), 2);
		Venda v2 = new Venda(p2, LocalDate.now(), 4);
		Venda v3 = new Venda(p3, LocalDate.now(), 4);
		
		try {
			System.out.println("Total por item: ");
			System.out.println("-----------------");
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v3);
			v1.calcularVenda();
			v2.calcularVenda();
			v3.calcularVenda();
			System.out.println("-----------------");
			System.out.println("Valor Total: R$" + Venda.getTotalVenda());
		} catch (Exception e) {
			
		}
		
	}

}
