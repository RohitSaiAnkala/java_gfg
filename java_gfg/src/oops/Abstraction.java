package oops;

/*
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods. (may also contain 0 abstract methods)
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */
public abstract class Abstraction {
    Abstraction() {
        System.out.println("In abstract class(Parent) constructor");
    }

    public void fun1() {
        System.out.println("fun1()");
    }

    abstract void fun2();

    static void fun3() {
        System.out.println("Static method fun3()");
    }

}

class SubClass extends Abstraction {
    @Override
    void fun2() {
        System.out.println("fun2()");
    }

    public static void main(String[] args) {
        Abstraction obj = new SubClass();
        obj.fun1();
        obj.fun2();
        Abstraction.fun3();
    }
}
