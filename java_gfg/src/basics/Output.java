package basics;

public class Output {
    /*
    Ways to Print Output
    System.out.println(), System.out.print(), System.out.format(), System.out.printf()
     */
    public static void main(String[] args) {
        int x=10,y=20;
//        char z='G';
//        String str="GFG";
//        System.out.println(x);
//        System.out.println(x+y);
//        System.out.println(x+" "+y);
//        System.out.print(str+" ");
//        System.out.print("Courses");

        System.out.format("x=%d\n",x);
        System.out.printf("y=%d\n",y);
        float f=(float)Math.PI;
        System.out.format("f=%.2f\n",f);

        System.out.format("f=%5.2f\n",f);/* prints total 5 characters in this case
         3.14 has total 4 characters so it appends a space before 3*/
        System.out.format("f=%07.2f\n",f); /*same like above eg but appends 0 instead of space
        since 3.14 has 4 chars and we told to print total 7 chars so remaining 3 will be zeros*/
    }
}
