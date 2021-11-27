package date;

import java.time.LocalDate;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		System.out.println(d.getYear() + " " + d.getMonthValue() + " " + d.getDayOfMonth());
		LocalDate d1 = LocalDate.of(1999, Month.AUGUST, 17);
		int dd = d1.getDayOfMonth();
		int mm = d1.getMonthValue();
		int yyyy = d1.getYear();
		System.out.println(d1);
		System.out.println(dd + "/" + mm + "/" + yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
	}
}
