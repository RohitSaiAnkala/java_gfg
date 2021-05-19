package class_basics;

/* This keyword
.this holds the value of the current object
.it calls the method of that respective object with their field values; (t1.print(),t2.print() with t1,t2 values)
.used when constructor params use same name as that of class variables (line no 15,16,17)
.chaining of functions is possible using this (line no 39)
 */
public class ThisDemo {
    int x, y;

    ThisDemo() {
//        this(100,200); (can be used to call parameterised constructor)
    }

    ThisDemo(int x, int y) {
//        this(); (can be used to call default constructor)
        this.x = x;
        this.y = y;
    }

    ThisDemo setX(int x) {
        this.x = x;
        return this;
    }

    ThisDemo setY(int y) {
        this.y = y;
        return this;
    }

    void print() {
        System.out.println("x=" + x + ",y=" + y);
    }
}

class TestThisDemo {
    public static void main(String[] args) {
        ThisDemo t1 = new ThisDemo(10, 20);
        t1.print();
        ThisDemo t2 = new ThisDemo();
        t2.setX(10).setY(20);/*t2.setX(10) will set x to 10
         and return t2(this) so it becomes t2.setY(20) and it sets y to 20 and return t2(this)*/
        t2.print();
    }
}


