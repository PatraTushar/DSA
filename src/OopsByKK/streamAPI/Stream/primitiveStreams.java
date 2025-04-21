package OopsByKK.streamAPI.Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class primitiveStreams {

    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);

        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));

        IntStream.of(1,2,3);

        DoubleStream doubles=new Random().doubles(5);
     //   System.out.println(doubles.sum());
      //  System.out.println(doubles.min());
      //  System.out.println(doubles.max());
      //  System.out.println(doubles.average());
        //System.out.println(doubles.summaryStatistics());
       // System.out.println(doubles.mapToInt(e->(int) (e+1)));
        System.out.println(doubles.boxed().toList());

        IntStream intStream=new Random().ints(5);
        System.out.println(intStream.boxed().toList());

    }
}
