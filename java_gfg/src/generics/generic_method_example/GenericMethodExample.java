package generics.generic_method_example;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericMethodExample {
    public static void main(String[] args) {
        Integer[] list1 = {10, 20, 30, 40, 50, 60, 70, 80};
        String[] list2 = {"Rohit", "Sai", "Ankala"};
        print(list1);
        print(list2);
        String s1 = "hello";
        String s2 = "rohit";
        System.out.println("Elements greater than 50 in the list are: "+countGreaterThan(list1, 50));
    }

    public static <E> void print(E[] list) {
        for (E ele : list) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem) {
        int count = 0;
        for (T ele : list) {
            if (ele.compareTo(elem) > 0)
                count++;
        }
        return count;
    }
}
