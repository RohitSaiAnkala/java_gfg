package strings;

/* String builder and String buffer is used for mutable version of strings
   String buffer is thread safe and can be used in multi-threaded environment where as string builder is used for single threaded environment.
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;
        sb1.append(" world");
        System.out.println("sb1 = " + sb1);
        System.out.println(sb1 == sb2);
        System.out.println(sb1.reverse());
        sb1.delete(0, 6);
        System.out.println("sb1 =" + sb1);
        System.out.println(sb1.charAt(0));
        sb1.setCharAt(0, 'y');
        System.out.println("sb1 = " + sb1);
        sb1.replace(0, 3, "geeksforgeeks");
        System.out.println("sb1 = " + sb1);
        sb1.insert(5, "----");
        System.out.println("sb1 = " + sb1);
    }
}
