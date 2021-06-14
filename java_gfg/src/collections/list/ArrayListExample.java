package collections.list;

import java.util.ArrayList;

/*
Internal working of ArrayList
. uses arrays internally
. if array becomes full then
   . create an array of double size
   . copy elements from old array to new array
   . free old array
 The amortised(average) time complexity to add an element in ArrayList is O(1)/theta(1).
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add function
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 10);
        System.out.println("list = " + list);
        // contains function
        System.out.println(list.contains(30));
        System.out.println(list.contains(12));
        // remove function
        list.remove((Integer) 10);
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);
        // get function
        System.out.println(list.get(0));
        // set function
        list.set(1, 20);
        System.out.println("list = " + list);
        // indexOf function
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(200)); // not present returns -1
        // lastIndexOf function
        System.out.println(list.lastIndexOf(20));
        System.out.println(list.lastIndexOf(200)); // not present returns -1
        // isEmpty and clear functions
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        /*
        Time-Complexities of above methods
        .add(obj) --> Amortised O(1)
        .size(),isEmpty(),get(),set() -->O(1)
        .remove(),contains(),indexOf(),lastIndexOf(),add(index,obj) --> O(n)
         */
    }
}
