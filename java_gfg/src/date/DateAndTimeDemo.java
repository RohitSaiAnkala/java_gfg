package date;

import java.time.LocalDateTime;

public class DateAndTimeDemo {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getDayOfMonth()+" "+dt.getHour());
		System.out.println(dt.plusMonths(6));
		System.out.println(dt.minusMonths(6));
	}
}
