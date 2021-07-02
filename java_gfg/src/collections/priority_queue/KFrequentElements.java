package collections.priority_queue;

import java.util.*;

public class KFrequentElements {
    static Map<Integer, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 20, 30};
        int k = 2;
        buildHashMap(arr);
        usingHashMapandArrayList(arr, k);
        usingHashMapAndPriorityQueue(arr, k);
        usingFrequencies(arr, k);
    }

    public static void buildHashMap(int[] arr) {
        for (int ele : arr)
            hashMap.put(ele, hashMap.getOrDefault(ele, 0) + 1);
    }

    public static void usingHashMapandArrayList(int[] arr, int k) {
        System.out.println("---------Using HashMap and ArrayList-----------");
        List<Map.Entry> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (e1, e2) -> {
            if (e1.getValue() == e2.getValue())
                return (Integer) e1.getKey() - (Integer) e2.getKey();
            return (Integer) e2.getValue() - (Integer) e1.getValue();
        });
        for (int i = 0; i < k; i++)
            System.out.println(list.get(i).getKey());
    }

    public static void usingHashMapAndPriorityQueue(int[] arr, int k) {
        System.out.println("--------Using HashMap and Priority Queue-----------");
        PriorityQueue<Map.Entry> pq = new PriorityQueue<>((e1, e2) -> {
            if (e1.getValue() == e2.getValue())
                return (Integer) e1.getKey() - (Integer) e2.getKey();
            return (Integer) e2.getValue() - (Integer) e1.getValue();
        });
        for (Map.Entry entry : hashMap.entrySet())
            pq.add(entry);
        for (int i = 0; i < k; i++)
            System.out.println(pq.poll().getKey());
    }

    public static void usingFrequencies(int[] arr, int k) {
        System.out.println("--------Using Frequency List in Linear Time---------");
        List<List<Integer>> frequencies = new ArrayList<>();
        for (int i = 0; i <= arr.length; i++)
            frequencies.add(new ArrayList<>());
        for (Map.Entry entry : hashMap.entrySet()) {
            frequencies.get((int) entry.getValue()).add((int) entry.getKey());
        }
        // 3 ->10 ,2->20,30
        int count = 0;
        for (int i = arr.length; i >= 1; i--) {
            for (int ele : frequencies.get(i)) {
                System.out.println(ele);
                count++;
                if (count == k)
                    return;
            }
        }

    }
}
