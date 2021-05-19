package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int x = 0, y = 0;
        char move;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a move:");
        move = sc.next().charAt(0);

        switch (move) {
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println(x + " " + y);
    }
}
