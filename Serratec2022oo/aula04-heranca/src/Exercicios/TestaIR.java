package Exercicios;

public class TestaIR {
	public static void main(String[] args) {
		
	
	PessoaFisica pf = new PessoaFisica("Vinicius", 2500, "17266691737", "0250001457");
	PessoaJuridica pj = new PessoaJuridica("ABC", 2500, "12545481454854", "45798595955");
	
	
	System.out.println(pf.getNome() + " terá que pagar R$" + pf.calcularIR() + " de Imposto de Renda");

	System.out.println(pj.getNome() + " terá que pagar R$" + pj.calcularIR() + " de Imposto de Renda");
	
	}
	
}
