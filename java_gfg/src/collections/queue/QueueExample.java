package collections.queue;

import java.util.Queue;
import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        queueFunctions1();
        System.out.println("---------------------");
        queueFunctions2();
    }

    public static void queueFunctions1() {
        // offer(),poll(),peek() --> these methods dont throw exceptions
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }

    public static void queueFunctions2() {
        // add(),remove(),element() -->these methods throw exceptions
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q.element());
    }
}
