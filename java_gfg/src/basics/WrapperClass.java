package basics;

public class WrapperClass {
    /* wrapper classes are used to convert primitive to object type
        int to Integer , byte to Byte ,char to Character etc
    Reason for converting :
    .collections uses non primitive like Integer but not int type
      (ArrayList<Integer> is there but not ArrayList<int>)
    . can change call by value to call by reference if required by using wrapper
    . can be used to convert string to any data type
      (Integer a=Integer.parseInt("1234"))
    . to support synchronisation in multithreading objects are required

     */
    public static void main(String[] args) {

        boolean b1=true;
        byte b = 10;
        short s = 123;
        int i = 100;
        long l = 1000;
        float f = 8.75f;
        double d = 123.45;
        char c = 65;

        //Autoboxing-->Converting primitives to object type
        System.out.println("------Autoboxing------");
        Boolean boolObj=b1;
        Byte byteObj=b;
        Short shortObj=s;
        Integer intObj=i;
        Long longObj=l;
        Float floatObj=f;
        Double doubleObj=d;
        Character charObj=c;

        System.out.println("boolObj = " + boolObj);
        System.out.println("byteObj = " + byteObj);
        System.out.println("shortObj = " + shortObj);
        System.out.println("intObj = " + intObj);
        System.out.println("longObj = " + longObj);
        System.out.println("floatObj = " + floatObj);
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("charObj = " + charObj);

        //Unboxing-->Converting object to primitve type
        System.out.println("------AutoUnboxing------");
        boolean boolVal=boolObj;
        byte byteVal=byteObj;
        short shortVal=shortObj;
        int intVal=intObj;
        long longVal=longObj;
        float floatVal=floatObj;
        double doubleVal=doubleObj;
        char charVal=charObj;

        System.out.println("boolVal = " + boolVal);
        System.out.println("byteVal = " + byteVal);
        System.out.println("shortVal = " + shortVal);
        System.out.println("intVal = " + intVal);
        System.out.println("longVal = " + longVal);
        System.out.println("floatVal = " + floatVal);
        System.out.println("doubleVal = " + doubleVal);
        System.out.println("charVal = " + charVal);







    }
}
