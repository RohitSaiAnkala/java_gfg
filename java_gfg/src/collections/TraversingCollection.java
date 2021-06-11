package collections;

import java.util.Arrays;
import java.util.List;
/*
collections can also be traversed through iterator refer to class IteratorExample.
 */
public class TraversingCollection {
    public static void main(String[] args) {
        traversingThroughforEach();
        traversingThroughStreams();

    }

    public static void traversingThroughforEach() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        for (Integer ele : list)
            System.out.print(ele + " ");
        System.out.println();
        list.forEach(ele -> System.out.print(ele + " "));
        System.out.println();
        list.forEach(System.out::println);
    }

    public static void traversingThroughStreams() {
        List<Integer> list = Arrays.asList(10, 15, 7, 20, 40);
        list.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream()
                .filter(x -> x > 10)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));


    }
}
