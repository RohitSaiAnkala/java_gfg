package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallerElements {
    public static void main(String[] args) {
        Integer arr1[]={8,100,20,40,3,7};
        Integer arr2[]={100,20,40,60,80,200};
        int [] arr3={10,40,80,30,20,15};
        System.out.println(findMinimumElementsThanK(arr1,10));
        System.out.println(findMinimumElementsThanK(arr2,50));
        System.out.println(findMin(arr3,30));
    }
    public static List<Integer> findMinimumElementsThanK(Integer [] arr,int k){
        List<Integer> list=Arrays.asList(arr);
        return list.stream()
            .filter(ele->ele<k)
            .collect(Collectors.toList());

    }
    public static List<Integer>findMin(int []arr,int k){
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k)
                list.add(arr[i]);
        }
        return list;
    }
}
