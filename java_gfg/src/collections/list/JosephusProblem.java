package collections.list;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

/*
Josephus problem involves n members in circle and k th person is killed and the sword is given
to next person after k  in circle
 */
public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(7, 3));
    }

    public static int josephus(int n, int k) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(i);
        Iterator<Integer> it = list.iterator();
        while (list.size() > 1) {
            while (it.hasNext()) {
                count++;
                it.next();
                if (count == k) {
                    it.remove();
                    count = 0;
                    break;
                }
            }
            if (!it.hasNext())
                it = list.iterator();
        }
        return list.get(0);
    }

}
