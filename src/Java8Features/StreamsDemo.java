package Java8Features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
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


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = list1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        List<List<String>> listsoflist = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        listsoflist.stream().flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::println);


        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        num.stream().map(n -> n * n).peek(System.out::println).collect(Collectors.toList());


        List<Integer> number = Arrays.asList(1, 20, 20, 30, 30, 4, 4, 5);
        List<Integer> unique = number.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

        List<Integer> asc = number.stream().sorted().collect(Collectors.toList());
        System.out.println(asc);

        List<Integer> desc = number.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(desc);


        // sort based on size of the word

        List<String> s = Arrays.asList("alice", "bob", "oggy", "imgroot", "chlreNoob");
        List<String> sortOnLength = s.stream().sorted((a, b) -> {

            int l1 = a.length();
            int l2 = b.length();

            return l1 < l2 ? -1 : l1 > l2 ? +1 : 0;
        }).collect(Collectors.toList());
        System.out.println(sortOnLength);


        List<Integer> list2 = Arrays.asList(33, 43, 53, 63, 73);
        List<Integer> skipping = list2.stream().skip(2).collect(Collectors.toList());
        System.out.println(skipping);


        List<Integer> list3 = Arrays.asList(331, 431, 531, 631, 731);
        List<Integer> limiting = list3.stream().limit(2).collect(Collectors.toList());
        System.out.println(limiting);


        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenSquaredList = list4.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.println(evenSquaredList);


    }
}

