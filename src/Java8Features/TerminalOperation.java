package Java8Features;

import java.util.*;
import java.util.stream.*;
public class TerminalOperation {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<String> names = Arrays.asList("ram","shyam","hari");

        // forEach()
        nums.stream().forEach(System.out::println);

        // forEachOrdered()
        nums.parallelStream().forEachOrdered(System.out::println);

        // toArray()
        Object[] arr1 = nums.stream().toArray();

        // toArray(IntFunction)
        Integer[] arr2 = nums.stream().toArray(Integer[]::new);

        // reduce(BinaryOperator)
        Optional<Integer> r1 =
                nums.stream().reduce((a,b) -> a+b);

        // reduce(identity, BinaryOperator)
        Integer r2 =
                nums.stream().reduce(0, (a,b) -> a+b);

        // reduce(identity, accumulator, combiner)
        Integer r3 =
                nums.parallelStream()
                        .reduce(
                                0,
                                (a,b) -> a+b,
                                (a,b) -> a+b
                        );

        // collect(Collector)
        List<Integer> list =
                nums.stream().collect(Collectors.toList());

        // collect(Supplier,Accumulator,Combiner)
        ArrayList<Integer> custom =
                nums.stream().collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );

        // min(Comparator)
        Optional<Integer> min =
                nums.stream().min(Integer::compareTo);

        // max(Comparator)
        Optional<Integer> max =
                nums.stream().max(Integer::compareTo);

        // count()
        long count =
                nums.stream().count();

        // anyMatch()
        boolean any =
                nums.stream().anyMatch(x -> x > 3);

        // allMatch()
        boolean all =
                nums.stream().allMatch(x -> x > 0);

        // noneMatch()
        boolean none =
                nums.stream().noneMatch(x -> x < 0);

        // findFirst()
        Optional<Integer> first =
                nums.stream().findFirst();

        // findAny()
        Optional<Integer> anyElement =
                nums.parallelStream().findAny();

        // iterator()
        Iterator<Integer> it =
                nums.stream().iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // spliterator()
        Spliterator<Integer> sp =
                nums.stream().spliterator();

        sp.forEachRemaining(System.out::println);

        // sum()
        int sum =
                nums.stream()
                        .mapToInt(Integer::intValue)
                        .sum();

        // average()
        OptionalDouble avg =
                nums.stream()
                        .mapToInt(Integer::intValue)
                        .average();

        // summaryStatistics()
        IntSummaryStatistics stats =
                nums.stream()
                        .mapToInt(Integer::intValue)
                        .summaryStatistics();

        // primitive min()
        OptionalInt pMin =
                nums.stream()
                        .mapToInt(Integer::intValue)
                        .min();

        // primitive max()
        OptionalInt pMax =
                nums.stream()
                        .mapToInt(Integer::intValue)
                        .max();

        // close()
        Stream<String> stream =
                names.stream();

        stream.close();

        // toList()  (Java 16+)
        List<Integer> result =
                nums.stream().toList();

    }
}
