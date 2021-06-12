package lambda_expression;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        String[] a = {"rohit", "sai"};
        String[] b = {"Rohit", "SAI"};
        if (Arrays.equals(a, b, String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
