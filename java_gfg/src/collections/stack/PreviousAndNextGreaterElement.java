package collections.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PreviousAndNextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        System.out.println(Arrays.toString(previousGreater(arr)));
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    public static int[] previousGreater(int[] arr) {
        int[] prev_greater = new int[arr.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            prev_greater[i] = getGreater(st, arr[i]);
            st.push(arr[i]);
        }
        return prev_greater;
    }

    public static int[] nextGreater(int[] arr) {
        int[] next_greater = new int[arr.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            next_greater[i] = getGreater(st, arr[i]);
            st.push(arr[i]);
        }
        return next_greater;
    }

    public static int getGreater(Deque<Integer> st, int curr) {
        while (!st.isEmpty()) {
            if (st.peek() > curr)
                return st.peek();
            st.pop();
        }
        return -1;
    }
}
