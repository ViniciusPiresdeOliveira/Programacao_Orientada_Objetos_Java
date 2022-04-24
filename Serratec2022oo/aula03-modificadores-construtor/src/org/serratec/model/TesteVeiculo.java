package org.serratec.model;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		char resposta = 's';
		Scanner sc = new Scanner(System.in);
		do {
			Veiculo v1 = new Veiculo();
			System.out.println("Digite a placa: ");
			v1.placa = sc.next();
			System.out.println("Digite o combustível: ");
			v1.tipoCombustivel = sc.next();
			System.out.println("Digite o valor do veículo: ");
			v1.valor = sc.nextDouble();
			System.out.println("O valor do IPVA 2022 será: R$" +v1.calcularIPVA());
			System.out.println("Deseja continuar (S/s) ");
			resposta = sc.next().charAt(0);
		} while (resposta == 's' || resposta == 'S');
		
			sc.close();
	}

}
