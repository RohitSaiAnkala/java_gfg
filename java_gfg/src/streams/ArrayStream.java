package streams;

import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Sum of array
        long sum = Arrays.stream(arr)
                         .sum();
        System.out.println("sum = " + sum);
        // Max element of array
        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();
        System.out.println("max = " + max);
        // Average of array
        double avg=Arrays.stream(arr)
              .average()
              .getAsDouble();
        System.out.println("avg = " + avg);
    }
}
