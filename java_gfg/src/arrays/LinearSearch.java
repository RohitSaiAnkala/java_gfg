package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 70, 80, 60, 20, 90, 40};
        int element = 20;
        int res=linearSearch(arr,element);
        if(res==-1)
            System.out.println("Element "+element+" not found in array");
        else
        System.out.println("Element " + element + " found in array at index: "+res);

    }
         static int linearSearch(int arr[],int element){
            for (int i=0;i<arr.length;i++) {
                if (arr[i] == element)
                    return i;
            }
            return -1;
        }
}
