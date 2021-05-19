package basics;

public class Operators {
    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean a = true, b = false;
        System.out.println("------Arithmetic Operators------");
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(y / x);
        int z = x + y * 10;
        System.out.println(z);
        z = x++;
        System.out.println(z + " " + x);
        z = ++x;
        System.out.println(z + " " + x);
        x += y;
        System.out.println(x);
        x %= y;
        System.out.println(x);
        z = x = y;
        System.out.println(x + " " + y + " " + z);

        System.out.println("---------Logical Operators--------");
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

        String s = null;
        if (s != null && s.length() < 10)
            /* If first condition fails for AND or
            first condition is succesful for OR
            then it doesn't execute 2nd condition*/
            System.out.println("Null");

        x = 10;
        y = 20;
        System.out.println("--------Relational Operators-------");
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
    }
}
