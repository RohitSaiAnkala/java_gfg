package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
