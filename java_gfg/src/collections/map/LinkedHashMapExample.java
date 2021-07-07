package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(10, "GfG");
        m.put(20, "IDE");
        m.put(15, "Courses");
        m.put(20, "Practice");
        System.out.println("m = " + m);
        cacheLinkedHashMap();
    }

    public static void cacheLinkedHashMap() {
        /*
         maintains order according to the most accessed elements (LRU(least recently used) cache)
         the frequent accessed item will be at last and the least frequently accessed will be at first.
         accessOrder is false --> default implementation of LinkedHashMap-->insertionOrder
         accessOrder is true --> LRU order
         loadFactor -->0.6 means our linkedHashMap is 60% full
         */

        Map<Integer, String> m = new LinkedHashMap<>(4, 0.6f, true);
        m.put(10, "GfG");
        m.put(20, "IDE");
        m.put(15, "Courses");
        System.out.println(m.get(10));
        System.out.println(m);
        m.put(20,"Practice");
        System.out.println(m);
    }
}
