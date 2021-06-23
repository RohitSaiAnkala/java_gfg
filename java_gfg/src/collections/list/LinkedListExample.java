package collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
. LinkedList implements list,queue and dequeue interfaces
. linkedlist internally uses doubly linked list for implementation . it has head and tail variables.
. get() and set() takes O(N) time in linkedlist but O(1) in Arraylist so Arraylist is used widely than linkedlist.
. adding an element at the end is O(1) but in arraylist it is theta(1)/O(N)
. not cache friendly as arraylist
 */
public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("list = " + list);
        
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        System.out.println("q = " + q);
    }
}
