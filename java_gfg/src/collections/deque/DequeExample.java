package collections.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        /* these methods
        offerFirst() ,offerLast(), peekFirst(), peekLast(), pollFirst(), pollLast()
        don't throw exception if deque is empty/full they return null/false*/
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerLast(40);
        System.out.println("dq = " + dq);
        dq.pollFirst();
        System.out.println("dq = " + dq);
        dq.pollLast();
        System.out.println("dq = " + dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println("---------------------");
    }

    public static void method2() {
         /* these methods
        addFirst() ,addLast(), getFirst(), getLast(), removeFirst(), removeLast()
        throw exception if deque is empty/full */
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(40);
        System.out.println("dq = " + dq);
        dq.removeFirst();
        System.out.println("dq = " + dq);
        dq.removeLast();
        System.out.println("dq = " + dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
