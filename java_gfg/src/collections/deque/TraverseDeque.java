package collections.deque;

import java.util.*;

public class TraverseDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerLast(15);
        System.out.println("dq = " + dq);

        Iterator<Integer> it = dq.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        for (int ele : dq)
            System.out.print(ele + " ");
        System.out.println();

        Iterator<Integer> it2 = dq.descendingIterator();
        while (it2.hasNext())
            System.out.print(it2.next() + " ");
    }
}
