package collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DSLinkedList {
    public static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        add(10);
        add(20);
        add(10);
        add(30);
        removeAndPrint(10);
        add(30);
        add(40);
        add(60);
        removeAndPrint(30);
    }

    public static void add(int ele) {
        list.add(ele);
    }

    public static void removeAndPrint(int ele) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int curr = iterator.next();
            if (ele == curr)
                iterator.remove();
            else
                System.out.print(curr + " ");
        }
        System.out.println();
    }
}
