package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        System.out.println("Original Collection: "+c);
        removeEven(c);
        System.out.println("After removing even elements:"+c);
    }

    public static void removeEven(Collection<Integer>list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int ele = iterator.next();
            if (ele % 2 == 0)
                iterator.remove();
        }
    }
}
/*
   it->position of iterator (iterator always begins from before position of the initial element
   (similar to -1 index)
   it.hasNext()->checks whether there is an element after the position of iterator
   it.next() -> returns the next element and moves the iterator to the next position( in b/w elements)
   it.remove()--> will remove the previous element before iterator position
  Initial collection:   it 10 15 20

    After 1st iteration:
            ele=10
            it.next()--> 10 it 15 20
            10 is even so it will be removed
            Collection Status : it 15 20

    After 2nd iteration:
            ele=15
            it.next()-->  15 it 20
            15 is odd so it will not be removed
            Collection Status : 15 it 20


    After 3rd iteration:
            ele=20
            it.next()-->  15 20 it
            20 is even so it will be removed
            Collection Status : 15 it

    it.hasNext() is false now and it exits from loop
    Final Collection: [15]
 */
