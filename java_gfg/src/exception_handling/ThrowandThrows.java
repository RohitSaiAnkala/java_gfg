package exception_handling;

import java.util.Scanner;

public class ThrowandThrows {
    public static void main(String[] args) {
        try {
            fun();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception Occured");
            e.printStackTrace();
        }
        System.out.println("Exit Main method");
    }
    static void fun() throws ArithmeticException {
        System.out.println("In fun()");
        int a=4, b;
        System.out.print("Enter b value: ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        if(b==0)
            throw new ArithmeticException();
        int c=a/b;
        System.out.println(c);
        System.out.println("Exit Fun method");
    }
}
