package oops;

// RunTime Polymorphism
public class MethodOverriding {
    int a=100;
    void fun1() {
        System.out.println("fun1() Parent");
    }

    void fun3() {
        System.out.println("fun3() Parent");
    }
}

class Child extends MethodOverriding {
    int a=40;
    void fun2() {
        System.out.println("fun2() Child");
    }

    @Override
    void fun3() {
        System.out.println("fun3() Child");
    }
}

class TestMethodOverriding {
    public static void main(String[] args) {
        MethodOverriding obj1 = new MethodOverriding();
        Child obj2 = new Child();
        MethodOverriding obj3 = new Child();

        System.out.println("----Parent ref and Parent Obj----");
        obj1.fun1();
        obj1.fun3();
        System.out.println(obj1.a);
//      obj1.fun2(); Cannot access as parent object cannot access child class

        System.out.println("----Child ref and Child Obj----");
        obj2.fun1();
        obj2.fun2();
        obj2.fun3();
        System.out.println(obj2.a);

        System.out.println("----Parent ref and Child Obj----");
        obj3.fun1();
        obj3.fun3();
        System.out.println(obj3.a); // fields cannot be overriden
//      obj3.fun2(); Compilation Error as reference is of type Parent and cannot access child class normal methods
//      Child ref and parent obj not possible i.e Child obj4=new MethodOverriding();
    }
}
