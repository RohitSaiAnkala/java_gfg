package lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.forEach(System.out::println);
        list.forEach(MyClass::square); // when methodReference is static
        System.out.println();
        list.forEach(new MyClass()::cube); // when methodReference is non-static or object
    }
}

class MyClass {
    public static void square(int n) {
        System.out.print(n * n + " ");
    }

    public void cube(int n) {
        System.out.print(n * n * n + " ");
    }
}
