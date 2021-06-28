package collections.deque;

import java.util.ArrayDeque;

/*
ArrayDeque can be used as  stack, queue, deque
internally arraydeque is implemented by a circular array (https://www.youtube.com/watch?v=WJres9mgiAk)
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        System.out.println("------------------");
        arrayDequeAsStack();
        System.out.println("------------------");
        arrayDequeAsQueue();
        System.out.println("------------------");
        arrayDequeAsDeque();

    }

    public static void arrayDequeAsStack() {
        /*pop and peek functions throw exceptions when stack is empty*/
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(40);
        System.out.println(st.peek());
    }

    public static void arrayDequeAsQueue() {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        q.offer(40);
        System.out.println(q.peek());
    }

    public static void arrayDequeAsDeque() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offerFirst(10);
        ad.offerLast(20);
        ad.offerFirst(30);
        ad.offerLast(40);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad.peekFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad.peekLast());


    }
}
