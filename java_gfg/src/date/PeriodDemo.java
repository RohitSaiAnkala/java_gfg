package date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1999, 8, 17);
		LocalDate today = LocalDate.now();
		Period period = Period.between(birthday, today);
		System.out.printf("Age is %d years, %d months , %d days", period.getYears(), period.getMonths(),
				period.getDays());
		LocalDate futureDay = LocalDate.of(1999 + 70, 8, 17);
		Period p = Period.between(today, futureDay);
		int d = p.getYears() * 365 + p.getMonths() * 30 + p.getDays();
		System.out.println("\n" + d);
	}
}
