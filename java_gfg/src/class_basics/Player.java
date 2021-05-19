package class_basics;

/* Static Demo
.static values are linked to class and not objects. shared among all objects of class
.static methods don't require object creation for invocation.(line 34)
.static methods don't have access to non-static methods and this reference also.
.non-static methods can access static methods and static variables
 */
public class Player {
    String name;
    int id;
    /* private */  static int playerCount = 0;

    Player(String name) {
        this.name = name;
        id = ++playerCount;
    }

    void print() {
        System.out.println(id + ": " + name);
    }

    static int getPlayerCount() {
        return playerCount;
    }
}

class TestPlayer{
    public static void main(String[] args) {
        Player p1 = new Player("abc");
        Player p2 = new Player("xyz");
        p1.print();
        p2.print();
        System.out.println(Player.playerCount);
        System.out.println(p1.playerCount); // static variable can be accessed using object also
        System.out.println(p2.playerCount);
        System.out.println(Player.getPlayerCount()); // no need of object creation to access static methods
        System.out.println(p1.getPlayerCount());
        System.out.println(p2.getPlayerCount());
    }
}
