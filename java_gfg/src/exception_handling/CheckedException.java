package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException{
    static void fun() {
        try {
            Scanner sc = new Scanner(new File("abcd.txt"));
            System.out.println("Exit Fun"); // would not be executed if exception occurs
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found Exception Caught");
        }
        finally {
            System.out.println("Finally block runs regardless of state of exception");
        }
        System.out.println("After try-catch-finally...life goes on");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("abc.txt")); // line generates a checked exception (if we remove throws in main)
        fun(); // comment above line and use this line to observe change
    }
}
