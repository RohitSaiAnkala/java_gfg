package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 20, 30, 8, 7));
        list.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .forEach(System.out::println);
       Integer sum= list.stream().reduce(Integer::sum).get();
        System.out.println("sum = " + sum);
        List<Integer>evenNumbers=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("evenNumbers = " + evenNumbers);
    }
}
