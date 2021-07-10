package collections.functions;

import misc.Point;

import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        // sort and reverse
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        // fill
        Collections.fill(list, 5);
        System.out.println(list);
        // binarySearch
        Integer[] arr = {1, 2, 3, 4};
        List<Integer> l1 = Arrays.asList(arr);
        System.out.println(Collections.binarySearch(l1, 3));
        System.out.println(Collections.binarySearch(l1, 4));
        // min and max value
        System.out.println(Collections.min(l1));
        System.out.println(Collections.max(l1));
        List<Point> points = new ArrayList<>();
        points.add(new Point(10, 20));
        points.add(new Point(5, 10));
        points.add(new Point(11, 30));
        System.out.println(Collections.min(points, Comparator.comparing(Point::getX)));
        // frequency
        Integer[] array = {1, 1, 2, 2, 3, 4};
        System.out.println(Collections.frequency(Arrays.asList(array), 1));
        System.out.println(Collections.frequency(Arrays.asList(array), 3));
        points.add(new Point(5, 10));
        System.out.println(Collections.frequency(points, new Point(5, 10)));
        Arrays.sort(array,(a,b)->{
            if(a==b)
                return 0;
            if(a%2==0)
                return -1;
            return 1;

        });
        System.out.println(Arrays.toString(arr));
        fun();
    }
    public static void fun(){
        // sorting elements according to frequency
        int [] arr ={10,10,10,5,5,20,20};
        Map<Integer,Integer> mp =new HashMap<>();
        for(int ele:arr)
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        System.out.println(mp);
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(mp.entrySet());
        System.out.println("list = " + list);
        Collections.sort(list,(e1,e2)->{
            if(e1.getValue()==e2.getValue())
                return e1.getKey()-e2.getKey();
           return e2.getValue()-e1.getValue();
        });
        System.out.println("list = " + list);
        int idx=0;
        for(Map.Entry entry:list){
            for(int i=0;i<(Integer)entry.getValue();i++)
                arr[idx++]=(int)entry.getKey();
        }
        System.out.println("arr = " + Arrays.toString(arr));


    }
}
