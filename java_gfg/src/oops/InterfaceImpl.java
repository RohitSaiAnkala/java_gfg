package oops;

interface Interface1 {
    int a = 100; // public static final int a=100 (modified by compiler)

    void fun();

    void fun1(); // public abstract void fun()(modified by compiler)

    default void msg() {
        System.out.println("Default method");
    }

    static void print() {
        System.out.println("Static method");
    }
}

interface Interface2 {
    int a = 20;

    void fun();

    void fun2();

    default void msg2() {
        System.out.println("Default method2");
    }
}

interface Interface3 extends Interface2 {
    //int a = 40;

    void fun3();
}

 public class InterfaceImpl implements Interface1, Interface3 {
    @Override
    public void fun() {
        System.out.println("In InterfaceImpl fun()");
    }

    @Override
    public void fun1() {
        System.out.println("In InterfaceImpl fun1() ");
    }

    @Override
    public void fun2() {
        System.out.println("In InterfaceImpl fun2()");
    }

    @Override
    public void fun3() {
        System.out.println("In InterfaceImpl fun3()");
    }

    @Override // optional to override default methods
    public void msg() {
        Interface1.super.msg();
        System.out.println("In msg method");
    }

    public static void main(String[] args) {
        InterfaceImpl obj = new InterfaceImpl();
        obj.fun();
        obj.fun1();
        obj.fun2();
        obj.fun3();
        obj.msg2();
        obj.msg();
        Interface1.print();
        System.out.println(Interface1.a + " " + Interface2.a + " " + Interface3.a);
    }
}



