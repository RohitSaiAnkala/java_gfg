package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int a[]=new int[]{10,20,30};
        int []arr={10,20,30};
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

        int arr1[],b;
        arr1=new int[3];
        b=10;
        System.out.println(arr1.length+" "+b);

        int[] arr2,c;
        arr2=new int[3];
        c=new int[3];
        // c=10; error, c also is of array type as int[] is a dataype and arr2,c both will be arrays
        System.out.println(arr2.length+" "+c.length);
        System.out.println(c[0]+" "+c[1]+" "+c[2]);

        Object[]objects=new Object[4];
        System.out.println(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]);

    }
}
