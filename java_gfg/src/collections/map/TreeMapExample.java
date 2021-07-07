package collections.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(10, "geeks");
        mp.put(15, "ide");
        mp.put(5, "courses");

        System.out.println("mp = " + mp);
        System.out.println(mp.containsKey(10));

        for (Map.Entry<Integer, String> entry : mp.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        System.out.println(mp.remove(10));
        System.out.println(mp.size());

        mp.put(10, "geeks");

        System.out.println(mp.higherKey(10));
        System.out.println(mp.lowerKey(10));
        System.out.println(mp.floorKey(10));
        System.out.println(mp.ceilingKey(10));
        System.out.println(mp.higherEntry(10).getValue());
        System.out.println(mp.lowerEntry(10).getValue());
        System.out.println(mp.floorEntry(10).getValue());
        System.out.println(mp.ceilingEntry(10).getValue());
    }
}
