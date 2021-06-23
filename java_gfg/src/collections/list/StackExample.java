package collections.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack<Integer>s=new Stack<>();
        Deque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
