package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        usingHashMap();
        usingLinkedHashMap();
        usingTreeMap();
    }

    public static void usingHashMap() {
        Map<Integer, String> map = new HashMap<>();
        buildMap(map);
        System.out.println("HashMap = " + map);
    }

    public static void usingLinkedHashMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        buildMap(map);
        System.out.println("LinkedHashMap = " + map);
    }

    public static void usingTreeMap() {
        Map<Integer, String> map = new TreeMap<>();
        buildMap(map);
        System.out.println("TreeMap = " + map);
    }

    public static void buildMap(Map<Integer, String> map) {
        map.put(2, "Aamer");
        map.put(3, "Rose");
        map.put(1, "Jack");
    }
}
