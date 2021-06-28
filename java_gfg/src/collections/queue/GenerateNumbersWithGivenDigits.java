package collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {
    public static void main(String[] args) {
        generateNumbers(5, 6, 10);
        generateStrings("5", "6", 10);
    }

    public static void generateNumbers(int d1, int d2, int n) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(d1);
        q.offer(d2);
        int size = 0;
        while (size < n) {
            int curr = q.poll();
            System.out.print(curr + " ");
            size++;
            q.offer(curr * 10 + d1);
            q.offer(curr * 10 + d2);
        }
        System.out.println();
        System.out.println(q);
    }

    public static void generateStrings(String d1, String d2, int n) {
        Queue<String> q = new ArrayDeque<>();
        q.offer(d1);
        q.offer(d2);
        int size = 0;
        while (size < n) {
            String curr = q.poll();
            System.out.print(curr + " ");
            size++;
            q.offer(curr + d1);
            q.offer(curr + d2);
        }

    }
}
