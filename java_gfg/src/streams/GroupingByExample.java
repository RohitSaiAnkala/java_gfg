package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        toMap();
        groupingBy();
        groupingByAndMapping();
    }
    public static void toMap(){
        List<Person> persons = GroupingByExample.create();
        persons.stream()
                .collect(Collectors.toMap(person->person.getName()+"--"+person.getAge()
                        ,person->person))
                .forEach((k,v)-> System.out.println(k+":"+v));
    }
    public static void groupingBy(){
        List<Person> persons = create();
        persons.stream()
                .collect(Collectors.groupingBy(Person::getName))
                .forEach((k,v)-> System.out.println(k+":"+v));
    }
    public static void groupingByAndMapping(){
        List<Person> persons = create();
        persons.stream()
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.mapping(Person::getAge,Collectors.toList())))
                .forEach((k,v)-> System.out.println(k+":"+v));
    }

    public static List<Person> create(){
        List<Person> personList = Arrays.asList(new Person("Sara", Person.Gender.FEMALE,12),
                new Person("Sara", Person.Gender.FEMALE,23),
                new Person("Paul", Person.Gender.MALE,32),
                new Person("Uday", Person.Gender.MALE,41),
                new Person("Paul", Person.Gender.MALE,52));
        return personList;
    }
}
class Person{
    String name;
    enum Gender{
        MALE,FEMALE;
    }
    Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
