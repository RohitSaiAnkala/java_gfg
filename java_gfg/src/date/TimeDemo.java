package date;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimeDemo {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime time1 = LocalTime.of(12, 35, 45);
		System.out.println(time1);
		LocalTime time2 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(time2);

		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		System.out.printf("%d:%d:%d:%d", hour, minute, second, nano);

	}
}
