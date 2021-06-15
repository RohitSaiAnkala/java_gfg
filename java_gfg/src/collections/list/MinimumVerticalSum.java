package collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/*Minimum Vertical sum of ArrayList of ArrayList
eg: arr = {{2 3 5}, {1 2}, {1 4 5 1}}
columns sum
{2 1 1} {3 2 4} {5 5} {1}
4,9,10,1 --> minimum is 1 so return 1
 */
public class MinimumVerticalSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(5);
        al2.add(6);

        ArrayList<Integer> al3 = new ArrayList<>();
        al3.add(7);
        al3.add(8);
        al3.add(9);
        al.add(al1);
        al.add(al2);
        al.add(al3);
        System.out.println(minimum_vertical_sum(al));
    }

    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr) {
        int size = arr.size(), sum = 0, max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i).size());
        }
        int colSum = 0, res = Integer.MAX_VALUE;
        for (int j = 0; j < max; j++) {
            colSum = 0;
            for (int i = 0; i < size; i++) {
                int elements_size = arr.get(i).size();
                if (j < elements_size)
                    colSum = colSum + arr.get(i).get(j);
            }
            if (colSum < res)
                res = colSum;
        }

        return res;
    }

}
