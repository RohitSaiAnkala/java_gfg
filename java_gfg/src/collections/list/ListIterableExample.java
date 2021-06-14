package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ListIterator<Integer> forwardIterator = list.listIterator();
        ListIterator<Integer> backwardIterator = list.listIterator(list.size());

        // forward traversal
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        // backward traversal
        System.out.println();
        while (backwardIterator.hasPrevious()) {
            System.out.print(backwardIterator.previous() + " ");
        }
        // set method (sets the previous() or next() element returned)
        backwardIterator = list.listIterator(list.size());
        while (backwardIterator.hasPrevious()) {
            int res = backwardIterator.previous();
            backwardIterator.set(res * 10);
        }
        System.out.println();
        System.out.println("list = " + list);
        // add method (adds it at current iterator position )
        forwardIterator = list.listIterator();
        while (forwardIterator.hasNext()) {
            forwardIterator.add(5);
            forwardIterator.next();
        }
        System.out.println("list = " + list);

        forwardIterator = list.listIterator(3);
        System.out.println(forwardIterator.previousIndex());
        System.out.println(forwardIterator.nextIndex());
    }
}
