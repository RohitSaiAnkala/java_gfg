package collections.functions;

import java.util.ArrayList;
import java.util.List;

public class ContainsAllExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        List<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(10);
        list2.add(30);
        boolean containsAll = list1.containsAll(list2);
        System.out.println(containsAll);
    }
}
