package misc;

import java.util.Arrays;
import java.util.Comparator;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        return o1.getX() - o2.getX();
    }
}

class TestPoint {
    public static void main(String[] args) {
        Point[] points = new Point[]{new Point(10, 20), new Point(5, 45), new Point(25, 35)};

        // Using class which implements Comparator Interface(Custom Comparator)
        Arrays.sort(points, new PointComparator());
        System.out.println(Arrays.toString(points));

        // Using anonymous class
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.getY() - o2.getY();
            }
        });
        System.out.println(Arrays.toString(points));

        // Using lambda expression
        Arrays.sort(points, (o1, o2) -> o2.getX() - o1.getX());
        System.out.println(Arrays.toString(points));

        // Using method references
        String [] arr={"gfg","IDE","GFG"};
        Arrays.sort(arr,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(arr));


    }
}
