package collections.list;

import java.util.*;

public class ReversingListUsingStack {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original List: " + list);
        reverse(list);
        System.out.println("Reversed List: " + list);
    }

    public static void reverse(List<Integer> list) {
//        Stack<Integer> s = new Stack<>();
        Deque<Integer> s=new ArrayDeque<>();
        for (Integer ele : list)
            s.push(ele);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, s.pop());
        }
    }
}
