package oops;

// using name Encapuslation instead of Student
public class Encapsulation {
    private float cgpa;
    private static int noOfStudents;


    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public static void setNoOfStudents(int noOfStudents) {
        Encapsulation.noOfStudents = noOfStudents;
    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }
}

 class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setCgpa(9.2f);
        System.out.println(e.getCgpa());
        Encapsulation.setNoOfStudents(200);
        System.out.println(Encapsulation.getNoOfStudents());

    }
}
