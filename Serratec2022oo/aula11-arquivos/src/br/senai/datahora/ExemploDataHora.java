package br.senai.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {

	public static void main(String[] args) {
		/*LocalTime hora = LocalTime.now();
		System.out.println(hora);
		System.out.println(LocalTime.of(22, 10));
		
		LocalDate dataAtual = LocalDate.now();
		LocalDateTime dataHora = LocalDateTime.of(2022, 4, 1, 22, 10);
		System.out.println(dataHora);
		System.out.println(LocalDateTime.now());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataAtual.format(dtf));*/
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		System.out.println(LocalTime.of(22,10));
		
		LocalDate dataAtual = LocalDate.now();
		LocalDateTime dataHora = LocalDateTime.of(2022, 4, 1, 22, 10);
		System.out.println(dataHora);
		System.out.println(LocalDateTime.now());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(dataHora.format(dtf));
	}

}
