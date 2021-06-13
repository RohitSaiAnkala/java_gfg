package streams;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Average Marks of Students
 */
public class MarksAverage {
    public static void main(String[] args) {
        Student[] arr = {
                new Student(1, 70, "Rohit"),
                new Student(2, 80, "Jyothik"),
                new Student(3, 60, "Karthik")};
        double avg = Arrays.stream(arr)
                           .mapToInt(student -> student.getMarks())
                           .average()
                           .getAsDouble();
        System.out.println("avg = " + avg);
    }
}

class Student {
    private int roll;
    private int marks;
    private String name;

    public Student(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}