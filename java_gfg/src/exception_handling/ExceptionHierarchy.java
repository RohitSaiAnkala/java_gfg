package exception_handling;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            fun();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception Occured");
            e.printStackTrace();
        }
    }
   static void fun(){
       System.out.println("In fun()");
       int a=4, b=0;
       int c=a/b;
       System.out.println(c);
    }
}
