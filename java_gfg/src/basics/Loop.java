package basics;

public class Loop {
    public static void main(String[] args) {
        System.out.println("----For Loop-----");
        for (int i = 0; i < 4; i++)
            System.out.println("GFG");
        int i = 0;
        System.out.println("---While Loop-----");
        while (i < 4) {
            System.out.println("GFG");
            i++;
        }
        i = 0;
        System.out.println("---Do While Loop----");
        do {
            System.out.println("GFG");
            i++;
        } while (i < 4);
    }
}
