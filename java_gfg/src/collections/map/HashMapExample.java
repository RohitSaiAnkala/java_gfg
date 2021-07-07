package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("gfg", 10);
        map.put("ide", 15);
        map.put("courses", 20);
        System.out.println("map = " + map);
        System.out.println("size =" + map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
        System.out.println(map.containsKey("ide"));
        System.out.println(map.remove("ide"));
        System.out.println("size ="+map.size());
        System.out.println(map.containsValue(20));
        System.out.println(map.get("gfg"));
        System.out.println(map.get("practice"));
    }
}
