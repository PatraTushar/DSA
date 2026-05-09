package Java8Features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        // Primitive Array
        int[] primitiveStream = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(primitiveStream);
        stream.forEach(System.out::println);

        // Object Arrays
        Integer[] objectArray = {10, 20, 30, 40};
        Stream<Integer> objectArray1 = Stream.of(objectArray);
        objectArray1.forEach(System.out::println);

        List<Integer> list = Arrays.asList(101, 201, 301, 401);
        list.stream().forEach(System.out::println);


        // Filter even numbers from Stream
        List<Integer> isEven = Arrays.asList(1000, 20001, 3020, 4111);
        isEven.stream().filter(x -> x % 2 == 0).forEach(System.out::println);


        // convert element of the list to uppercase
        List<String> names = Arrays.asList("charlie", "oggy", "bob");
        names.stream().map(String::toUpperCase).forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        Integer sum = list1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        List<List<String>> listsoflist = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        listsoflist.stream().flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::println);




    }
}

