package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        Student[] arr = {
                new Student(1, 70, "Rohit"),
                new Student(2, 80, "Jyothik"),
                new Student(3, 60, "Karthik"),
                new Student(4,70,"Mohan")};
        // Collecting as Map
        Map<Integer, String> map =
                Arrays.stream(arr)
                        .collect(Collectors.toMap(Student::getRoll, Student::getName));
        map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
        // Collecting as List
        List<Integer> marks = Arrays.stream(arr)
                                    .map(Student::getMarks)
                                    .collect(Collectors.toList());
        System.out.println("list = " + marks);
        // Collecting using group by
        Map<Integer,List<Student>>mp=Arrays.stream(arr)
                                           .collect(Collectors
                                                    .groupingBy(Student::getMarks));

        mp.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
    }
}
