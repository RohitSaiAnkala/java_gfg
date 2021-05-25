package oops;

import com.sun.xml.internal.rngom.parse.host.Base;

// using name Inheritance instead of Bicycle
public class Inheritance {
    int gear;
    int speed;
    private int var;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    Inheritance() {
    }

    public Inheritance(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String printInfo() {
        return ("Gear is:" + gear + "\nSpeed is:" + speed);
    }

}

class Derived extends Inheritance {
    int seatHeight;

    Derived() {
    }

    public Derived(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nSeat Height is:" + seatHeight + "\nVar is:" + getVar();
    }

    @Override
    public String toString() {
        return "Derived{" +
                "gear=" + gear +
                ", speed=" + speed +
                ", seatHeight=" + seatHeight +
                ", var=" + getVar() +
                '}';
    }

}

class Test {
    public static void main(String[] args) {
        Derived d = new Derived(3, 100, 25);
        d.speedUp(20);
        d.setSeatHeight(22);
        d.setVar(200);
        System.out.println(d);
        System.out.println(d.printInfo());
    }
}
// Read more about inheritance (is a relationship) vs composition  (has a relationship)
// and also association,aggregation and composition concepts
