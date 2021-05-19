package basics;

class Point {
    int x;
    int y;
}

public class NonPrimitiveDataType {
    // Non Primitive includes all object/refernce types (string ,array , class)
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println(p1.x); // default values
        System.out.println(p1.y); // // default values

        p1.x=100;
        System.out.println(p1.x+" "+p2.x);
        p2=p1;
        p2.x=50;
        System.out.println(p1.x+" "+p2.x);

        /*since p2 is holding p1 reference and it is changing the value of x at heap memory
         and p1 is also pointing to same reference
         hence both p1.x and p2.x will be 50(refer to same location)*/
    }
}
