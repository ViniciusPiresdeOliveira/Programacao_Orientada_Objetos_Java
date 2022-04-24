package br.com.senai.model;

public class TestePlano {

	public static void main(String[] args) {
		
		Clinica clinica = new Clinica("Sul América", "Checkup", "215454515");
		Medico medico = new Medico("Golden Cross" , "2514454515", "Ana Luiza");
		Anestesista anestesista = new Anestesista("Amil", "Carlos", "343434", "Geral");
		
		ControlePagamento cp = new ControlePagamento();
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);
		
		System.out.println(clinica);
        System.out.println(medico);
        System.out.println(anestesista);

        System.out.println("O valor pago é: "+ String.format("%.2f" , cp.getTotalPago()));

}
}