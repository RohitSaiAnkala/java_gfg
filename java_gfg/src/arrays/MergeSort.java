package arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        System.out.println("Given Array\n" + Arrays.toString(arr));
        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted Array\n" + Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, r);
        }
        return;
    }

    static void merge(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        int[] c, d;
        c = new int[(r - l) / 2 + 1];
        d = new int[(r - l) / 2 + 1];

        int a = 0, b = 0;
        for (int i = l; i <= mid; i++)
            c[a++] = arr[i];
        for (int i = mid + 1; i <= r; i++)
            d[b++] = arr[i];
        int i = 0, j = 0;
        while (i < a && j < b) {
            if (c[i] < d[j]) {
                arr[l++] = c[i];
                i++;
            } else {
                arr[l++] = d[j];
                j++;
            }
        }
        while (i < a) {
            arr[l++] = c[i];
            i++;
        }
        while (j < b) {
            arr[l++] = d[j];
            j++;
        }
    }
    // 0 1 2 3 4 5
    // 2,3,4,5,1,2
}
