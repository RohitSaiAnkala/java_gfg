package collections.functions;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        List<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(20);
        list2.add(40);
        list2.add(30);
        System.out.println("Before Removal: " + list1);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println("After Removal: " + list1);
    }
}
