package class_basics;
//Class Demo
public class Complex {
    int real, imag;

    void print() {
        System.out.println(real + " +i" + imag);
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void add(Complex c) {
        real = real + c.real;
        imag = imag + c.imag;
    }
}

class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        System.out.print("c1:  ");
        c1.print();
        Complex c2 = new Complex(20, 30);
        System.out.print("c2:  ");
        c2.print();
        c1.add(c2);
        System.out.print("sum: ");
        c1.print();
    }
}
