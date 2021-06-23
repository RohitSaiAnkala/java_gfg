import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class TestCommit {
    public static void main(String[] args) {
        Pair p1 = new Pair(10, 40);
        Pair p2 = new Pair(20, 30);
        Pair p3 = new Pair(10, 20);
        Pair[] arr = new Pair[]{p1, p2, p3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.x == o2.x)
                return o1.y - o2.y;
            return o1.x - o2.x;
        });
        System.out.println(Arrays.toString(arr));
        fun(arr);
        fun2(false, 24.52);
}

    static <E> void fun(E[] array) {
        for (E ele : array) {
            System.out.println(ele);
        }
    }

    static <Z> void fun2(Z a, Z b) {
        System.out.println(a + " " + b);
    }
}

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
