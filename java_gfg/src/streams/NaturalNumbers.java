package streams;

import java.util.stream.Stream;

/*
Print first n natural with given digit d
eg: n=10 , d=5
Outptu: 5,15,25,35,45,50,51,52,53,54
 */
public class NaturalNumbers {
    public static void main(String[] args) { 
     Stream.iterate(1, x->x+1)
              .filter(x->x.toString().contains("5"))
              .limit(10)
              .forEach(x->System.out.print(x+" "));
    }
}
