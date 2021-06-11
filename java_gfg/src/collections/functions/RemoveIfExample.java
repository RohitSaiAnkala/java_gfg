package collections.functions;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(27);
        list1.add(30);
        list1.add(41);
        System.out.println("Original List: " + list1);
        list1.removeIf(ele -> ele % 2 == 0);
        System.out.println("After removeIf List: " + list1);
    }
}

