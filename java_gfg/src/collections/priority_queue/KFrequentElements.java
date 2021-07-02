package collections.priority_queue;

import java.util.*;

public class KFrequentElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 20, 30};
        int k = 2;
        System.out.println("---------Using HashMap and ArrayList-----------");
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int ele : arr)
            hashMap.put(ele, hashMap.getOrDefault(ele, 0) + 1);

        List<Map.Entry> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (e1, e2) -> {
            if (e1.getValue() == e2.getValue())
                return (Integer) e1.getKey() - (Integer) e2.getKey();
            return (Integer) e2.getValue() - (Integer) e1.getValue();
        });
        for (int i = 0; i < k; i++)
            System.out.println(list.get(i).getKey());

        System.out.println("--------Using HashMap and Priority Queue-----------");
        PriorityQueue<Map.Entry> pq = new PriorityQueue<>((e1, e2) -> {
            if (e1.getValue() == e2.getValue())
                return (Integer) e1.getKey() - (Integer) e2.getKey();
            return (Integer) e2.getValue() - (Integer) e1.getValue();
        });
        for (Map.Entry entry : hashMap.entrySet())
            pq.add(entry);
        for(int i=0;i<k;i++)
            System.out.println(pq.poll().getKey());
    }
}
