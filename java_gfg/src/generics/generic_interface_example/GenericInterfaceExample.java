package generics.generic_interface_example;


public class GenericInterfaceExample {
    public static void main(String[] args) {
        GenericList<String> list1 = new GenericList<>();
        list1.add("hello");
        GenericList<Integer> list2 = new GenericList<>();
        list2.add(1000);
        System.out.println(list1.getMyList());
        System.out.println(list2.getMyList());
    }
}

interface GenericInterface<T> {
    public void add(T t);
}
