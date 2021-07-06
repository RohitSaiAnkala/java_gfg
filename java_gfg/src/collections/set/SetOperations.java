package collections.set;

import java.util.*;

// three main operations are union, intersection and difference
public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        buildSets(s1, s2);
        union(s1, s2);
        intersection(s1, s2);
        difference(s1, s2);
        fun();
    }

    public static void buildSets(Set<Integer> s1, Set<Integer> s2) {
        s1.add(10);
        s1.add(20);
        s2.add(20);
        s2.add(30);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    public static void union(Set<Integer> s1, Set<Integer> s2) {
        System.out.println("-----UNION OPERATION-----");
        s1.addAll(s2);
        System.out.println("s1 = " + s1);
    }

    public static void intersection(Set<Integer> s1, Set<Integer> s2) {
        System.out.println("-----INTERSECTION OPERATION-----");
        s1.retainAll(s2);
        System.out.println("s1 = " + s1);
    }

    public static void difference(Set<Integer> s1, Set<Integer> s2) {
        System.out.println("-----DIFFERENCE OPERATION-----");
        s2.remove(30);
        s1.removeAll(s2);
        System.out.println("s1 = " + s1);
    }
    public static void fun(){
        Set<Integer>set=new HashSet<>(Arrays.asList(10,20,30,20,10));
        System.out.println("set = " + set);
    }
}
