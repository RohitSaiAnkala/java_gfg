package generics;

import java.util.ArrayList;
import java.util.Date;

public class ComparableExample {

    public static void main(String[] args) {
        Comparable c1 = new Date();
//        System.out.println(c1.compareTo("Monday"));

        Comparable<Date> c2 = new Date();
//        System.out.println(c2.compareTo("Monday"));

        /* c1-->without using generics--> RunTime exception
           c2-->with using generics-->CompileTime Exception (when u uncomment line 12)
         */

        ArrayList a = new ArrayList();
        a.add(15);
        a.add("15");
//        Integer res = (Integer) a.get(1);
//        System.out.println("res = " + res);
        /*above line will throw runtime exception of classcast when u try to convert string to integer*/


        ArrayList<Integer> b = new ArrayList();
        b.add(15);
//        b.add("15");
      /* above line throws compile time exception as arraylist with generics
         only takes the elements with the specific type of the generic (Integer in this case)*/


        Pair<Integer, String> p1 = new Pair(1, "Rohit");
        Pair<String, Integer> p2 = new Pair("Sai", 2);
        disp(p1.getKey(), p1.getValue());
        disp(p2.getKey(), p2.getValue());
        disp("Ankala", "Rohit Sai");
    }


    public static <K, V> void disp(K key, V value) {
        System.out.println("key = " + key + " ,value = " + value);
    }
}

class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
