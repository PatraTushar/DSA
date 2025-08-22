package OopsByKK.streamAPI.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {


    public static void main(String[] args) {

        // stream->  (i)it is a feature introduced in java 8.(ii)it process collections of data in a functional and declarative manner.(iii)it simplifies data processing.(iV)Improve readability and maintainability.(v)use functional programming.(vi)Enable easy parallelism

        // when stream was not introduced we have to use loop  ,if -else statement due to which the code was much longer due to which readability was lesser and chances of errors are more

        // How to use stream ?
        // Ans->Source,intermediate operation and terminal operation.

        // what is stream?
        // A sequence of elements supporting functional and declarative programming.

        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().filter(e->e%2==0).count());

        // creating stream

        // 1.From collection

        List<Integer> list=Arrays.asList(1,2,3,4,5);
        list.stream().forEach(System.out::print);

        System.out.println();

        // 2.From Arrays
        String[] array={"a","b","c"};
        Arrays.stream(array).forEach(System.out::println);

        // 3.Using Stream.of()
        Stream.of("a","b","c").forEach(System.out::print);

        System.out.println();

        // Infinite streams

        List<Integer> collect=Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
        System.out.print(collect);

        System.out.println();

        List<Double> list1= Stream.generate(Math::random).limit(10).collect(Collectors.toList());
        System.out.println(list1);








    }





}
