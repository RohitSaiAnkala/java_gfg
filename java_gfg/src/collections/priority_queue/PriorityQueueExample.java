package collections.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

/* Min heap (Parent<Child) for all levels (default implementation)
   Max heap (Parent>Child) for all levels
    10         20
   /  \       /  \
   15 20     10  15
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println("-----Min Heap-----");
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println("-----Max Heap-----");
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);
        pq1.add(20);
        pq1.add(15);
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
        System.out.println(pq1.peek());
    }
}
