package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseFirstKItems {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        addElements(q);
        System.out.println(q);
        reverseFirstK(q, 4);
        System.out.println(q);
    }

    public static void addElements(Queue<Integer> q) {
        q.offer(10);
        q.offer(200);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
    }

    public static void reverseFirstK(Queue<Integer> q, int k) {
        if (k <= 0 || k > q.size())
            return;
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < k; i++)
            st.push(q.poll());
        while (!st.isEmpty())
            q.offer(st.pop());
        for (int i = q.size() - k; i > 0; i--)
            q.offer(q.poll());
    }
}
