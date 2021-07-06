package collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* LinkedHashSet maintains the insertion order.
   It maintains a doubly-linked list internally
   time complexeties for insert,delete and search is O(1)
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(30);
        System.out.println("set = " + set);
        set.remove(20);
        set.add(20);
        System.out.println("set = " + set);
    }
}
