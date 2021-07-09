package misc;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMethods {
    public static void main(String[] args) {
        // nullFirst
        String[] arr = {"gfg", "ide", null, "courses", null};
        Arrays.sort(arr, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr));

        // reverseOrder
        String[] arr1 = {"gfg", "ide", "courses"};
        Arrays.sort(arr1, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr1));

        // comparing and thenComparing
        Company[] companies = {new Company(2, "rohit"), new Company(1, "rohit"), new Company(3, "vinay")};
        Arrays.sort(companies,Comparator.comparing(Company::getName).thenComparing(Company::getId));
        System.out.println(Arrays.toString(companies));
    }
}
