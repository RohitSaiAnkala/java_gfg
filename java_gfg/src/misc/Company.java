package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company implements Comparable<Company> {
    private int id;
    private String name;
    public Company(){}

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Company o) {
        return this.id-o.id;
    }
}
// Comparable and Comparator Demo
class TestCompany{
    public static void main(String[] args) {
        Company c = new Company();
        ArrayList<Company>al= new ArrayList<>();
        al.add(new Company(2,"rohit"));
        al.add(new Company(1,"gupta"));
        al.add(new Company(3,"vinay"));
        Collections.sort(al);
        System.out.println("al = " + al);
        Collections.sort(al,(o1,o2)->o2.getName().compareTo(o1.getName()));
        System.out.println("al = " + al);
    }
}
