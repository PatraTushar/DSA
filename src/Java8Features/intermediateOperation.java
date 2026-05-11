package Java8Features;

import java.util.*;
import java.util.stream.*;

public class intermediateOperation {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1,2,3,4,5,5,6);
        List<String> names = Arrays.asList("ram","shyam","hari");

        // filter()
        nums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        // map()
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // mapToInt()
        names.stream().mapToInt(String::length).forEach(System.out::println);

        // mapToLong()
        nums.stream().mapToLong(x -> x).forEach(System.out::println);

        // mapToDouble()
        nums.stream().mapToDouble(x -> x * 1.0).forEach(System.out::println);

        // flatMap()
        List<List<Integer>> nested =
                Arrays.asList(
                        Arrays.asList(1,2),
                        Arrays.asList(3,4)
                );

        nested.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // flatMapToInt()
        Stream.of(new int[]{1,2}, new int[]{3,4})
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);

        // flatMapToLong()
        Stream.of(new long[]{1,2}, new long[]{3,4})
                .flatMapToLong(Arrays::stream)
                .forEach(System.out::println);

        // flatMapToDouble()
        Stream.of(new double[]{1.1,2.2}, new double[]{3.3})
                .flatMapToDouble(Arrays::stream)
                .forEach(System.out::println);

        // distinct()
        nums.stream().distinct().forEach(System.out::println);

        // sorted()
        nums.stream().sorted().forEach(System.out::println);

        // sorted(Comparator)
        nums.stream().sorted((a,b) -> b-a).forEach(System.out::println);

        // peek()
        nums.stream().peek(System.out::println).count();

        // limit()
        nums.stream().limit(3).forEach(System.out::println);

        // skip()
        nums.stream().skip(2).forEach(System.out::println);

        // takeWhile()
        Stream.of(1,2,3,4,1)
                .takeWhile(x -> x < 4)
                .forEach(System.out::println);

        // dropWhile()
        Stream.of(1,2,3,4,1)
                .dropWhile(x -> x < 4)
                .forEach(System.out::println);

        // boxed()
        IntStream.range(1,5)
                .boxed()
                .forEach(System.out::println);

        // sequential()
        nums.parallelStream()
                .sequential()
                .forEach(System.out::println);

        // parallel()
        nums.stream()
                .parallel()
                .forEach(System.out::println);

        // unordered()
        nums.stream()
                .unordered()
                .forEach(System.out::println);

        // onClose()
        Stream<String> stream =
                names.stream()
                        .onClose(() -> System.out.println("Closed"));

        stream.close();

        // mapMulti()
        nums.stream()
                .mapMulti((x, consumer) -> consumer.accept(x * 2))
                .forEach(System.out::println);

        // mapMultiToInt()
        Stream.of(1,2,3)
                .mapMultiToInt((x, consumer) -> consumer.accept(x * 2))
                .forEach(System.out::println);

        // mapMultiToLong()
        Stream.of(1L,2L,3L)
                .mapMultiToLong((x, consumer) -> consumer.accept(x * 2))
                .forEach(System.out::println);

        // mapMultiToDouble()
        Stream.of(1.0,2.0,3.0)
                .mapMultiToDouble((x, consumer) -> consumer.accept(x * 2))
                .forEach(System.out::println);

        // asLongStream()
        IntStream.range(1,5)
                .asLongStream()
                .forEach(System.out::println);

        // asDoubleStream()
        IntStream.range(1,5)
                .asDoubleStream()
                .forEach(System.out::println);

        // mapToObj()
        IntStream.range(1,5)
                .mapToObj(String::valueOf)
                .forEach(System.out::println);
    }
}
