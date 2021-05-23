package multi_threading;

public class ExtendingThread {
    public static void main(String[] args) throws InterruptedException {
        TestExtendingThread t = new TestExtendingThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Main Thread");
            Thread.sleep(1);
        }
    }
}

class TestExtendingThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        System.out.println("Inside Test Thread");
    }
}
