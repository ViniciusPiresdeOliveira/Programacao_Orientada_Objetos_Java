package exercicio_livraria;

public class TestaLivro {

	public static void main(String[] args) {

		Livro l1 = new Livro("Frederico Chaves Guedes", "Don Fredon", 85);
		Livro l2 = new Livro("Germán Cano" , "Faz o L", 85);
		Operacao op1 = new Operacao("Venda", l1);
		Operacao op2 = new Operacao("Empréstimo", l2);
		
		l1.reajuste(6);
		l2.reajuste(0);
		op1.venderLivro();
		op2.emprestarLivro();
		
		
		
		
		System.out.println(op1.toString() + l1.toString());
		System.out.println(op2.toString() + l2.toString());

		
		
		
		

	}

}
