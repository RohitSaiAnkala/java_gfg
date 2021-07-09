package strings;

public class StringExample {
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));
        System.out.println(s.substring(2, 4));

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));

        String s5 = "geeksforgeeks";
        String s6 = "geeks";
        System.out.println(s5.contains(s6));
        int res = s5.compareTo(s6);
        if (res == 0)
            System.out.println("Equal");
        else if (res > 0)
            System.out.println("s5 Greater Lexicographically");
        else
            System.out.println("s5 Smaller Lexicographically");
        System.out.println(s5.indexOf(s6));
        System.out.println(s5.indexOf(s6, 1));
        System.out.println(s5.lastIndexOf(s6));

    }
}
