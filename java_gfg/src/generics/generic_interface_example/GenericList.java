package generics.generic_interface_example;

public class GenericList<T> implements GenericInterface<T> {
    public T myList;
    @Override
    public void add(T t) {
        myList=t;
    }

    public T getMyList() {
        return myList;
    }
}
