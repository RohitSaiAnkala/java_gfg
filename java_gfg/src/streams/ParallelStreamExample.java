package streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // using streams
    Timeit.code(() -> System.out.println(
        numbers.stream()
               .filter(e -> e % 2 == 0)
               .mapToInt(ParallelStreamExample::compute)
               .sum()));
    // using parallel streams
    Timeit.code(() -> System.out.println(
        numbers.parallelStream()
            .filter(e -> e % 2 == 0)
            .mapToInt(ParallelStreamExample::compute)
            .sum()));
  }
/*
. streams doesn't store data. It is purely an abstraction, pipeline of transformation.
.should be extremely careful when using parallelStreams. More resources(threads) will be needed but you will get output faster.
 */
  public static int compute(int ele) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return ele * 2;
  }
}


class Timeit {

  public static void code(Runnable block) {
    long start = System.nanoTime();
    try {
      block.run();
    } finally {
      long end = System.nanoTime();
      System.out.println("Time Taken: " + (end - start) / 1e9 + " seconds");
    }
  }
}