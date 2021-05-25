package oops;
/*
The abstract class can also be used to provide some implementation of the interface.
In such case, the end user may not be forced to override all the methods of the interface.
 */
public abstract class AbstractClassWithInterface implements DemoInterface {
    @Override
    public void c() {
        System.out.println("In c()");
    }
    // a,b,c,d methods are there in interface but we are not forced to override all of them in abstract class.
}

  class ChildAbstractClass extends AbstractClassWithInterface {

    @Override
    public void a() {
        System.out.println("In a()");
    }

    @Override
    public void b() {
        System.out.println("In b()");
    }

    @Override
    public void d() {
        System.out.println("In d()");
    }

    public static void main(String[] args) {
        DemoInterface obj = new ChildAbstractClass();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }

 }


interface DemoInterface {
    void a();

    void b();

    void c();

    void d();
}
