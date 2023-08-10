package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2023-08-09");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-09T01:30:25");
		Instant d06 = Instant.parse("2023-08-09T01:30:25Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7); // Uma semana atrás
		LocalDate nextWeekLocalDate = d04.plusDays(7); // Uma semana depois

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // Uma semana atrás
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // Uma semana depois

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());// Preciso converter para
																								// DateLocalTime
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant); // Invertido

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());

	}

}
