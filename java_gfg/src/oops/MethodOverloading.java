package oops;

/*
In methodoverloading
. different methods have same name but signature of method is different
    (type of arguments,no of arguments,order of arguments -->signature)
. it is used to increase code readability ( same name suggests the functionality of the method more easily than
using a different name eg: add 2 no's and add 3 no's)
.Method Overloading is not possible by changing the return type of method only because there will be ambiguity
compiler dont know to call which method eg: int fun(), String fun() ambiguity to call which fun()
 */
public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    void fun(int a,long b){
        System.out.println("fun() with int,long params");
    }
    void fun(long a,int b){
        System.out.println("fun() with long,int params");
    }
}

class TestMethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(10, 10));
        System.out.println(obj.add(10, 10, 10));
        System.out.println(obj.add(2.5, 2.5));
       // obj.fun(10,20); ambiguity but obj.fun(10L,20) or obj.fun(10,20L) will work
//        TestMethodOverloading.main(90);
        TestMethodOverloading t = new TestMethodOverloading();
        t.main();
    }

    // Main method can also be overloaded but JVM calls main with String array args by default
    public static void main(int a) {
        System.out.println("In overloaded main " + a);
    }

    public void main() {
        System.out.println("In main");
    }

}
