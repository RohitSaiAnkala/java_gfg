package basics;

public class TypeConversion {
    /*
    type conversion is of 2 types
    lower type to higher type -->done automatically by java-->implicit typecast
    higher type to lower type --> should be done by programmer-->explicit typecast
    Priority order: byte,short,int,long,float,double
     */
    public static void main(String[] args) {
        byte byteVal=65;
        int intVal=byteVal; // implicit type cast (automatic)
        System.out.println("intVal = " + intVal);

        byte byteVal2=(byte)intVal; // explicit type cast
        System.out.println("byteVal2 = " + byteVal2);

        char charVal=(char)intVal; // explicit type cast
        System.out.println("charVal = " + charVal);
    }
}
