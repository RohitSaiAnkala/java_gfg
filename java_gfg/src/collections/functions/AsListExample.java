package collections.functions;

import java.util.Arrays;
import java.util.List;
/*
asList() -->it converts array to list , but any changes made in the collection will reflect in array
and vice-versa. (just adds wrapper to array)
 */
public class AsListExample {
    public static void main(String[] args) {
        asListExample();
    }
    public static void asListExample() {
        Integer[] ints = {1, 2, 3, 4};
        List<Integer> list= Arrays.asList(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(list);
        list.set(0,100);
        System.out.println(Arrays.toString(ints));
        System.out.println(list);

    }
}
