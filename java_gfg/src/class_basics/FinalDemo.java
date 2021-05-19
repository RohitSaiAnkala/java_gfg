package class_basics;
/*
. final can be used for variable(local,instance,class)--> No Reinitialisation
. final can be used for method-->No overriding
. final can be used for class -->No Inheritance

 */
public  final class FinalDemo {
    final int x=100;  // instance final variable
    static final int MAX=20; // static(class) final variable
}
class TestFinalDemo{
    public static void main(String[] args) {
        final int x; // local final variable
        x=100;
        System.out.println(x);

        FinalDemo fd=new FinalDemo();
        System.out.println(fd.x);
        System.out.println(FinalDemo.MAX);

        final StringBuffer sb=new StringBuffer("Geeks");
        sb.append("forGeeks");
        System.out.println(sb);
    }
}
