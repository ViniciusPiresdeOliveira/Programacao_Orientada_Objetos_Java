package br.senai.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {

	public static void main(String[] args) {
		LocalTime hora1 = LocalTime.now();
		System.out.println(hora1);
		System.out.println(LocalTime.of(22, 10));
		LocalDate dataAtual = LocalDate.now();
		LocalDateTime dataHora = LocalDateTime.of(2022, 4, 1, 22, 10);
		System.out.println(dataHora);
		System.out.println(LocalDateTime.now());
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataAtual.format(dtf1) + "\n");
		System.out.println("================================= \n");
		LocalTime hora2 = LocalTime.now();
		System.out.println(hora2);
		System.out.println(LocalTime.of(22,10));
		LocalDate dataAtual2 = LocalDate.now();
		LocalDateTime dataHora2 = LocalDateTime.of(2022, 4, 1, 22, 10);
		System.out.println(dataHora);
		System.out.println(LocalDateTime.now());
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(dataHora.format(dtf2));
	}

}
