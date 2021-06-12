package lambda_expression;


import java.util.Arrays;

public class MyFunctionalInterfaceImpl {
    public static void main(String[] args) {
        MyFunctionalInterface<String> reverse = (str) -> {
            String result = "";
            char[] chars = str.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                result += chars[i];
            }
            return result;
        };
        MyFunctionalInterface<Integer> factorial = (n) -> {
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            return fact;
        };
        System.out.println(reverse.fun("Rohit"));
        System.out.println(factorial.fun(5));
    }
}

/*
An interface with only 1 abstract method is called functionalInterface
 */
@FunctionalInterface
interface MyFunctionalInterface<T> {
    T fun(T str);
}