package class_basics;

/* Constructor Demo
. Constructor has same name as that of class
. It has no return type
. It is used to initialise variables
. It is of 2 types: Default(with no parameters) and Parameterised(with parameters)
 */
public class Point {
    int x, y;

    // developer should only write default constructor also if he is using parameterised constructor
    Point() {
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    void print() {
        System.out.println("x=" + x + ",y=" + y);
    }
}

class TestPoint {
    public static void main(String[] args) {
        // Calling Default Constructor
        Point p1 = new Point();
        p1.print();
        // Calling Parameterised Constructor
        Point p2 = new Point(10, 20);
        p2.print();

    }
}
