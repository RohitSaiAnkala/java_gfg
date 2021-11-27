package date;

import java.time.Year;
import java.util.Scanner;

public class YearDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year:");
		int year = sc.nextInt();
		Year y = Year.of(year);
		if(y.isLeap())
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
		
	}
}
