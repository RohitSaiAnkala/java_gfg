package basics;

import java.util.Scanner;

public class InputUsingScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a string: ");
//        String s=sc.nextLine();
//        System.out.println("s:"+s);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.println("i: " + i);

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();
        System.out.println("f: " + f);

        System.out.print("Enter a string:");
        sc.nextLine(); // use this bcoz the cursor will be in the line of above float val read and will read \n
        String s = sc.nextLine();
        System.out.print("s:" + s);

    }
}
