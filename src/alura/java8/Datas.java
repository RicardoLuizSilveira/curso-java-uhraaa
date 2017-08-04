package alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println("Data de hoje: " + hoje);

		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataFutura);
		
		Period hojeEdataFutura = Period.between(hoje, dataFutura);

		int anos = dataFutura.getYear() - hoje.getYear();
		System.out.println("Anos para a olimpiada: " + anos);

		Period periodo = Period.between(hoje, dataFutura);
		System.out.println(periodo);

		System.out.println(
				"Anos: " + periodo.getYears() + " - Meses: " + periodo.getMonths() + " - Dias: " + periodo.getDays());
		
		
		System.out.println(hoje.minusYears(7));
		System.out.println(hoje.minusMonths(7));
		System.out.println(hoje.minusDays(3));
		
		System.out.println(hoje.plusYears(3));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(10));
		
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatarData));
		
		
		// TEMPOS
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		
		DateTimeFormatter formatarDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		System.out.println(agora.format(formatarDataHora));
		
		DateTimeFormatter formatarAnoMes = DateTimeFormatter.ofPattern("MM-yyyy");
		
		YearMonth anoMes = YearMonth.of(2018, Month.APRIL);
		System.out.println(anoMes.format(formatarAnoMes));
		
		LocalTime intervalo = LocalTime.of(12, 10);
		System.out.println(intervalo);
		
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		
		Period hojeEdataFutura = Period.between(hoje, dataFutura);
		
		
	}

}
