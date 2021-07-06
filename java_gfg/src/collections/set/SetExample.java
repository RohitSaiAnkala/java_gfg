package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// used to store unique elements. It extends from collection interface so we get all functions of collection interface

public class SetExample {
    public static void main(String[] args) {
        usingHashSet();
        usingLinkedHashSet();
        usingTreeSet();
    }

    public static void usingHashSet() {
        // Items will be stored using hashtable and when u access set the elements will be in random order and unique
        Set<Integer> set = new HashSet<>();
        buildSet(set);
        System.out.println("HashSet = " + set);
    }

    public static void usingLinkedHashSet() {
        // Items will be stored using hashtable and when u access set the elements will be in insertion order and unique
        Set<Integer> set = new LinkedHashSet<>();
        buildSet(set);
        System.out.println("LinkedHashSet = " + set);
    }

    public static void usingTreeSet() {
        // Items will be stored using red-black tree and when u access set the elements will be in sorted order and unique
        Set<Integer> set = new TreeSet<>();
        buildSet(set);
        System.out.println("TreeSet = " + set);
    }

    public static void buildSet(Set<Integer> set) {
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
    }
}
