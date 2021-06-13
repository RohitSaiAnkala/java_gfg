package streams;

import java.util.Arrays;

/*
Print Strings that start with "a" and end with "c" lexicographically.
 */
public class LexicoGraphicStrings {
    public static void main(String[] args) {
        String[] strs={"abc","cde","acd","aec","xyz","adc"};
        Arrays.stream(strs)
              .filter(x->x.startsWith("a")&&x.endsWith("c"))
              .sorted()
              .forEach(System.out::println);
    }
}
