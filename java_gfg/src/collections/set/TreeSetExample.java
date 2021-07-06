package collections.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/* LinkedHashSet maintains the sorted order.
   It maintains a red-black tree internally
   time complexeties for insert,delete and search is O(logN)
 */
public class TreeSetExample {
    public static void main(String[] args) {
      treeSetOfStrings();
      treeSetOfIntegers();
    }
    public static void treeSetOfStrings(){
        Set<String> set = new TreeSet<>();
        set.add("gfg");
        set.add("courses");
        set.add("ide");
        System.out.println("set = " + set);
        System.out.println(set.contains("ide"));
        Iterator<String> it=set.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();
    }
    public static void treeSetOfIntegers(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(2);
        set.add(15);
        set.remove(5);
        for(Integer ele: set)
            System.out.print(ele+" ");
        System.out.println("\n"+set.lower(5));
        System.out.println(set.higher(5));
        System.out.println(set.floor(5));
        System.out.println(set.ceiling(3));
    }
}
