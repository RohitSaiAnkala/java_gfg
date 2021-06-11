package collections.functions;

import java.util.ArrayList;
import java.util.List;

public class AddAllExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(40);
        list3.addAll(1, list1);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
