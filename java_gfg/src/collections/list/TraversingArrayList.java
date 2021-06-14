package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("gfg");
        list.add("ide");
        list.add("courses");
        System.out.println("--------Using get----------");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println("-------Using forEach loop----------");
        for (String str : list)
            System.out.println(str);
        System.out.println("-------Using forEach method---------");
        list.forEach(System.out::println);
        System.out.println("-----Using iterator---------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
