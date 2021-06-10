package generics.generic_class_example;

public class GenericClassExample {
    public static void main(String[] args) {
        Person<Employee> p1 = new Person<>();
        Person<Contact> p2 = new Person<>();
        Employee e = new Employee("RohitSai", "Ankala", "1234");
        Contact c = new Contact("Mr", "Gupta", "Pandiri", "1234567");
        p1.setPerson(e);
        p2.setPerson(c);
        System.out.println(p1.getPerson());
        System.out.println(p2.getPerson());
    }
}
