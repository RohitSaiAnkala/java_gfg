package basics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        boolean boolVal=true; // size: 1 bit
        byte byteVal = 10; // size: 1 byte range:-128 to 127
        short shortVal = 123; // size: 2 bytes range: -2^15 to 2^15-1
        int intVal = 100; // size: 4 bytes range: -2^31 to 2^31-1
        long longVal = 1000; // size: 8 bytes range: -2^63 to 2^63-1
        float floatVal = 8.75f; // size : 4 bytes
        double doubleVal = 123.45; // size: 8 bytes
        char charVal = 65; // size: 2 bytes range: 0 to 2^16-1 (includes unicode characters)

        System.out.println("booleanVal ="+boolVal);
        System.out.println("byteVal = " + byteVal);
        System.out.println("shortVal = " + shortVal);
        System.out.println("intVal = " + intVal);
        System.out.println("longVal = " + longVal);
        System.out.println("floatVal = " + floatVal);
        System.out.println("doubleVal = " + doubleVal);
        System.out.println("charVal = " + charVal);

    }
}
