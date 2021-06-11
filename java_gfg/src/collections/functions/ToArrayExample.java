package collections.functions;

import java.util.*;

/*
toArray() -->it always creates a new array , so any changes made in the collection won't reflect in array
and vice-versa.
 */
public class ToArrayExample {
    public static void main(String[] args) {
//        toArrayExample();
        toArrayExample2();
    }

    public static void toArrayExample() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(15);
        q.add(20);
        Object[] arr2 = list.toArray();
        System.out.println(Arrays.toString(arr2));

        list.set(0,100);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
    public static void toArrayExample2() {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        Integer[] ints=new Integer[list.size()];
        ints=list.toArray(ints);
        Integer[] ints2 =list.toArray(new Integer[0]);
        /*if the size is zero then toArray method creates a new array and copies the list
        elements to array and returns it.
         */
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints2));

    }


}
