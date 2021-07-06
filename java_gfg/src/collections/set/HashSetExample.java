package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* HashSet gives the elements in random order.
   It maintains a hash-table internally.
   time complexeties for insert,delete and search is O(1)
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> h = new HashSet<>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println("h = " + h);
        System.out.println(h.contains("ide"));
        System.out.println("----------Using Iterator---------");
        Iterator<String> it= h.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println("\n-------Using forEach loop--------");
        for (String s: h)
            System.out.print(s+" ");
        System.out.println("\n-------Using forEach function-----");
        h.forEach((s)->System.out.print(s+" "));
        }
    }
