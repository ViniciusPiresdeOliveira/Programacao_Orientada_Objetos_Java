package br.com.senai.datas;

import java.time.LocalDate;
import java.time.Period;

public class ExemploLocalDate {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println(LocalDate.of(2022, 04, 25));

		System.out.println(LocalDate.parse("2022-04-25"));
		
		System.out.println(hoje.plusDays(10));
		
		System.out.println(hoje.minusYears(10));
		
		System.out.println(hoje.isLeapYear());
		
		//Period periodo = Period.between(LocalDate.of(2022, 01, 01), hoje);
		//System.out.println(periodo.getDays());
	}

}
