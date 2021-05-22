package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 80, 60, 20, 90, 40};
        int element = 20;
        Arrays.sort(arr); // to perform binary_search array needs to be sorted first
        System.out.println(Arrays.toString(arr));
        int res=binarySearch(arr,element,0,arr.length-1);
        if(res==-1)
            System.out.println("Element "+element+" not found in array");
        else
            System.out.println("Element " + element + " found in array at index: "+res);

    }
    static int  binarySearch(int[] arr, int ele, int low, int high){
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==ele)
            return mid;
        if(ele>arr[mid])
           return binarySearch(arr,ele,mid+1,high);
        else
            return binarySearch(arr,ele,low,mid-1);
    }
//       0 1 2 3
    //   1 2 3 4
}
