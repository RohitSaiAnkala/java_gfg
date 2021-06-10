package generics;

import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("sai");
        list2.add("hello");

        System.out.println("Original List: "+list1);
        System.out.println("List After Removing Duplicates: "+eliminateDuplicates(list1));
        System.out.println("Original List: "+list2);
        System.out.println("List After Removing Duplicates: "+eliminateDuplicates(list2));
    }

    //    public static <E> ArrayList<E> eliminateDuplicates(ArrayList<E> list){
//        ArrayList<E> newArrayList=new ArrayList<>();
//        for(E ele:list) {
//            if (!newArrayList.contains(ele))
//                newArrayList.add(ele);
//        }
//        return newArrayList;
//    }
    public static <E extends Comparable<E>> ArrayList<E> eliminateDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (E ele : list) {
            boolean found = false;
            for (E element : newList) {
                if (element.compareTo(ele) == 0) {
                    found = true;
                    break;
                }
            }
            if (!found)
                newList.add(ele);
        }
        return newList;
    }
}