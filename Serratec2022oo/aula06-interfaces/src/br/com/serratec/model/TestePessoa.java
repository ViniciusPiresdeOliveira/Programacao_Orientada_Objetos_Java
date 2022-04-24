package br.com.serratec.model;

public class TestePessoa {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("Vinicius", "Rua Afrânio Mello", 8500, "Quitandinha");
		PessoaJuridica pj = new PessoaJuridica("V!", "Moacyr Barbosa", 5500, "5458487477777777", "Xpto kiew");
		TotalTributos tt = new TotalTributos();
	
		
		System.out.println("Total de IR da PF: R$" + pf.calculaImpostoDeRenda());
		System.out.println("Total de IR da PJ: R$" + pj.calculaImpostoDeRenda());
		System.out.println("Total de ICMS: R$" + pj.calcularICMS());
		
		
		tt.totalizarTributos(pj);
		tt.totalizarTributos(pf);
		
		System.out.println("Total geral: R$" + tt.getTotal());
	}

}
