package br.com.senai.datas;

import java.time.LocalDate;
import java.time.Period;

public class ExemploDiferenca {

	public static void main(String[] args) {
		LocalDate dataAniversario = LocalDate.of(1975, 06, 20);
		LocalDate hoje = LocalDate.now();
		System.out.println("Dia da semana: " + hoje.getDayOfWeek().name());
		System.out.println("Mês: " + hoje.getMonthValue());
		System.out.println("Ano: " + hoje.getYear());
		
		Period periodo = Period.between(dataAniversario, hoje);
		System.out.println("Passaram: " + periodo.getYears() + " anos");
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		System.out.println("Já se passaram " + hoje.getDayOfYear() + " dias desde o início do ano");
		
		
	}

}
