package lambda_expression;

public class LamdbaExpressions {
    public static void main(String[] args) {
        Test1 obj1 = () -> System.out.println("Hello World");
        Test2 obj2 = a -> System.out.println(a);
        Test3 obj3 = (a, b) -> System.out.println(a + " " + b);
        obj1.fun();
        obj2.fun(10);
        obj3.fun(10, 20);
    }
}

interface Test1 {
    void fun();
}

interface Test2 {
    void fun(int a);
}

interface Test3 {
    void fun(int a, int b);
}
