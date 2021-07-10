package arrays;

import misc.Point;
import misc.PointComparator;

import java.util.*;

public class ArrayMethods {
    public static void main(String[] args) {
//        fillMethod();
//        binarySearch();
//        equals();
//        mismatch();
//        compare();
//        asList();
        toStringExample();
    }

    public static void fillMethod() {
        int[] arr = {10, 20, 30, 40};
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 0, 2, -2);
        System.out.println(Arrays.toString(arr));
        int[][] multi = new int[3][4];
        for (int[] row : multi) {
            Arrays.fill(row, 1);
            System.out.println(Arrays.toString(row));
        }
    }

    public static void binarySearch() {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(arr, 40)); // returns index of key or else -ve value (-(insertion index+1))
        System.out.println(Arrays.binarySearch(arr, 0, 3, 30));
        System.out.println(Arrays.binarySearch(arr, 22)); // -(insertion index+1) -> -(2+1) -> -3
        Point[] points = new Point[]{new Point(10, 20), new Point(20, 15), new Point(25, 35)};
        System.out.println(Arrays.binarySearch(points, new Point(20, 15), new PointComparator()));
    }

    public static void equals() {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = {1, 3, 4, 2};
        checkEqual(a, b);
        checkEqual(a, c);
        Integer[] d = {1, 2, null, 3};
        Integer[] e = {1, 2, null, 3};
        if (Arrays.equals(d, e))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        // sub-array version of equals method
        subArrayEquals();

        String s1[] = {"GFG", "IDE"};
        String s2[] = {"gfg", "ide"};
        if (Arrays.equals(s1, s2, String::compareToIgnoreCase))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void subArrayEquals() {
        Integer[] f = {10, 20, 30, 40, 50, 60};
        Integer[] g = {30, 40, 50, 60, 5, 8};
        if (Arrays.equals(f, 2, 6, g, 0, 4))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void checkEqual(int[] arr1, int[] arr2) {
        if (Arrays.equals(arr1, arr2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }

    public static void mismatch() {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 20, 30, 40};
        int[] c = {10, 20, 40, 30};
        // returns -1 if both arrays/subarrays are same
        System.out.println(Arrays.mismatch(a, b));
        System.out.println(Arrays.mismatch(a, c));
        System.out.println(Arrays.mismatch(a, 0, 2, b, 0, 2));
        String s1[] = {"GFG", "IDE"};
        String s2[] = {"gfg", "Courses"};
        System.out.println(Arrays.mismatch(s1, s2, String::compareToIgnoreCase));
    }

    public static void compare() {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = {3, 2, 1, 4};
        int[] d = {1, 2, 3};
        System.out.println(Arrays.compare(a, b));
        System.out.println(Arrays.compare(a, c));
        System.out.println(Arrays.compare(c, b));
        System.out.println(Arrays.compare(a, d));

        Integer[] e = {1, 2, null, 4};
        Integer[] f = {1, 2, 3, 0};
        System.out.println(Arrays.compare(e, f));

        Integer[] g = {1, 2, 3, 4, 5};
        Integer[] h = {6, 2, 3, 4, 7};
        System.out.println(Arrays.compare(g, 1, 4, h, 1, 4));

        String[] s1 = {"gfg", "ide"};
        String[] s2 = {"GFG", "IDE"};
        System.out.println(Arrays.compare(s1, s2, String::compareToIgnoreCase));
    }

    public static void asList() {
        String[] arr = {"gfg", "courses", "ide"};
        // list is just wrapper over the array anychanges made in array will reflect in list and changes in list will reflect in array
        List<String> list = Arrays.asList(arr);
        System.out.println("lst = " + list);
        arr[0] = "practice";
        System.out.println("lst = " + list);
        list.set(1, "premium");
        System.out.println(Arrays.toString(arr));

        // asList used for reversing an array
        Collections.reverse(Arrays.asList(arr));
        System.out.println("reversed array = " + Arrays.toString(arr));

        // asList used for creating hashset,priority_queue,treeset etc in the constructor calling
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println("hashSet = " + hashSet);
    }

    public static void toStringExample() {
        char[] chars = {'a', 'b', 'c', 'd'};
        System.out.println(chars);
        Point[] points = {new Point(10, 20), new Point(5, 40), new Point(30, 40)};
        System.out.println(Arrays.toString(points));
    }
}
