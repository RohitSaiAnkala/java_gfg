package collections.priority_queue;


import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {3, 5, 4, 2, 9};
        System.out.println(kthLargest(arr, 3));
        System.out.println(kthSmallest(arr,2));
    }

    public static int kthLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr)
            pq.add(ele);
        int count = 1;
        while (count < k) {
            pq.poll();
            count++;
        }
        return pq.poll();
    }

    public static int kthSmallest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr)
            pq.add(ele);
        int count = 1;
        while (count < k) {
            pq.poll();
            count++;
        }
        return pq.poll();
    }
}
