package basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //   Even or odd Check
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");

        // Sum of first n natural numbers where n is input from keyboard
        System.out.print("Enter a number:");
        number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }
        System.out.println("Sum of first " + number + " natural numbers is: " + (number * (number + 1) / 2));

        // checking for number is positive,negative,even and odd at same time
        System.out.print("Enter a number:");
        number = sc.nextInt();
        if (number == 0)
            System.out.println("Zero");
        else if (number > 0 && number % 2 == 0)
            System.out.println("Positive Even");
        else if (number > 0)
            System.out.println("Positive Odd");
        else if (number < 0 && number % 2 == 0)
            System.out.println("Negative Even");
        else
            System.out.println("Negative Odd");
    }
}
