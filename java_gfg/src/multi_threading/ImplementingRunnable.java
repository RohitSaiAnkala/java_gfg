package multi_threading;

public class ImplementingRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new TestImplementingRunnable());
        t.start();
        System.out.println("Inside Main Thread");
    }
}
class TestImplementingRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("Inside Implementing Runnable Thread");
    }
}
