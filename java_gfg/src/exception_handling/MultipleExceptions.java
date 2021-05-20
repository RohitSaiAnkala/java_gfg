package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            fun();
            Scanner sc=new Scanner(new File("abc.txt"));
            /*Lines which may possibly raise an exception
            but type of exception is unknown*/
            System.out.print("Exit Try");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception Occured");
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found Exception Occured");
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("A new type of exception occured");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block runs regardless of exception");
        }
        System.out.println("After try-catch-finally life goes on");
    }
    static void fun(){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter b:");
            int b=sc.nextInt();
            System.out.println(2/b);
        }
        finally {
            System.out.println("Finally block of fun()");
        }
    }
}
