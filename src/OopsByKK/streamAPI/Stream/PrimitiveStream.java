package OopsByKK.streamAPI.Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class PrimitiveStream {

    public static void main(String[] args) {

        // 1: Creating Primitive Streams

        // a) From factory methods

        IntStream intStream = IntStream.of(1, 2, 3);
        LongStream longStream = LongStream.of(10L, 20L, 30L);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);

        // b) Using range() and rangeClosed()

        IntStream.range(1, 5).forEach(System.out::println);
        IntStream.rangeClosed(10, 15).forEach(System.out::println);


        // c) From arrays

        int[] arr = {500, 501, 502, 503};
        IntStream st = Arrays.stream(arr);
        st.filter(e -> e % 2 == 0).forEach(System.out::println);


        // d) From random numbers

        // new Random().ints(5, 1, 10)-> Generate a stream of 5 random integers between 1 (inclusive) and 10 (exclusive)
        IntStream randomInts = new Random().ints(5, 1, 10);   // First argument (5) → how many numbers you want (stream size)   Second argument (1) →start of the range (inclusive)  Third argument(10) →end of the range (exclusive)
        randomInts.forEach(System.out::println);

      // e) Infinite streams

        System.out.println(IntStream.iterate(1000,e->e+1).limit(10).count());
        IntStream.iterate(1000,e->e+1).limit(5).forEach(System.out::println);


        // 2:  Terminal Operations

        System.out.println(IntStream.of(1,2,3).sum());  // 6
        System.out.println(IntStream.of(1,2,3).average()); // OptionalDouble(2.0)
        System.out.println(IntStream.of(1,2,3).max()); //  OptionalInt(3)
        System.out.println(IntStream.of(1,2,3).min()); // OptionalInt(1)
        System.out.println(IntStream.of(1,2,3).count()); // 3



        // 3: Intermediate Operations


        IntStream.range(80,90).filter(e->e%2==0).forEach(System.out::println);

        // Special primitive methods:
        //sum(), average(), summaryStatistics()
        //asDoubleStream(), asLongStream()
        //boxed() → convert primitive stream → normal Stream<T>


        List<Integer> list=IntStream.range(30,40).boxed().collect(Collectors.toList());
        System.out.println(list);


        // 4: Reduction & Collecting

        // a) Reduction

        int product=IntStream.rangeClosed(1,5).reduce(1,(a,b)->a*b);
        System.out.println(product);   // 120

        // b) Summary Statistics

        IntSummaryStatistics stats = IntStream.of(1,2,3,4,5).summaryStatistics();
        System.out.println(stats.getAverage()); // 3.0
        System.out.println(stats.getSum());     // 15
        System.out.println(stats.getMax());     // 5

        // Converting Between Streams














    }
}
