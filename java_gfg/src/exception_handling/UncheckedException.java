package exception_handling;

public class UncheckedException {
    public static void main(String[] args) {
        try {
          int no1=Integer.parseInt(args[0]);
            System.out.println(no1);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient no of args");
        }
    }
    // Unchecked/Runtime exception occurs when u directly try to use args[0] without handling in try-catch
}
