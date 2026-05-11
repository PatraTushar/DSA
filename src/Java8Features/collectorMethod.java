package Java8Features;

import java.util.*;
import java.util.stream.*;


public class collectorMethod {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("ram","shyam","hari","ram");

        List<Integer> nums =
                Arrays.asList(1,2,3,4,5);

        // toList()
        List<String> list =
                names.stream()
                        .collect(Collectors.toList());

        // toSet()
        Set<String> set =
                names.stream()
                        .collect(Collectors.toSet());

        // toMap()
        Map<String,Integer> map =
                names.stream()
                        .distinct()
                        .collect(Collectors.toMap(
                                s -> s,
                                s -> s.length()
                        ));

        // joining()
        String joined =
                names.stream()
                        .collect(Collectors.joining(","));

        // joining(delimiter,prefix,suffix)
        String join2 =
                names.stream()
                        .collect(Collectors.joining(
                                "-",
                                "[",
                                "]"
                        ));

        // groupingBy()
        Map<Integer,List<String>> group =
                names.stream()
                        .collect(Collectors.groupingBy(
                                String::length
                        ));

        // groupingBy + counting()
        Map<Integer,Long> countGroup =
                names.stream()
                        .collect(Collectors.groupingBy(
                                String::length,
                                Collectors.counting()
                        ));

        // partitioningBy()
        Map<Boolean,List<Integer>> partition =
                nums.stream()
                        .collect(Collectors.partitioningBy(
                                x -> x % 2 == 0
                        ));

        // counting()
        Long count =
                names.stream()
                        .collect(Collectors.counting());

        // mapping()
        List<Integer> lengths =
                names.stream()
                        .collect(Collectors.mapping(
                                String::length,
                                Collectors.toList()
                        ));

        // filtering()
        List<String> filtered =
                names.stream()
                        .collect(Collectors.filtering(
                                s -> s.length() > 3,
                                Collectors.toList()
                        ));

        // reducing()
        Integer reduced =
                nums.stream()
                        .collect(Collectors.reducing(
                                0,
                                Integer::sum
                        ));

        // summarizingInt()
        IntSummaryStatistics stats1 =
                nums.stream()
                        .collect(Collectors.summarizingInt(
                                Integer::intValue
                        ));

        // summarizingLong()
        LongSummaryStatistics stats2 =
                nums.stream()
                        .collect(Collectors.summarizingLong(
                                Integer::longValue
                        ));

        // summarizingDouble()
        DoubleSummaryStatistics stats3 =
                nums.stream()
                        .collect(Collectors.summarizingDouble(
                                Integer::doubleValue
                        ));

        // averagingInt()
        Double avg1 =
                nums.stream()
                        .collect(Collectors.averagingInt(
                                Integer::intValue
                        ));

        // averagingLong()
        Double avg2 =
                nums.stream()
                        .collect(Collectors.averagingLong(
                                Integer::longValue
                        ));

        // averagingDouble()
        Double avg3 =
                nums.stream()
                        .collect(Collectors.averagingDouble(
                                Integer::doubleValue
                        ));

        // summingInt()
        Integer sum1 =
                nums.stream()
                        .collect(Collectors.summingInt(
                                Integer::intValue
                        ));

        // summingLong()
        Long sum2 =
                nums.stream()
                        .collect(Collectors.summingLong(
                                Integer::longValue
                        ));

        // summingDouble()
        Double sum3 =
                nums.stream()
                        .collect(Collectors.summingDouble(
                                Integer::doubleValue
                        ));

        // collectingAndThen()
        List<String> unmodifiable =
                names.stream()
                        .collect(Collectors.collectingAndThen(
                                Collectors.toList(),
                                Collections::unmodifiableList
                        ));

        // flatMapping()
        List<List<String>> nested =
                Arrays.asList(
                        Arrays.asList("a","b"),
                        Arrays.asList("c","d")
                );

        List<String> flat =
                nested.stream()
                        .collect(Collectors.flatMapping(
                                l -> l.stream(),
                                Collectors.toList()
                        ));

        // teeing()
        Double average =
                nums.stream()
                        .collect(Collectors.teeing(
                                Collectors.summingInt(x -> x),
                                Collectors.counting(),
                                (sum,total) -> sum / (double) total
                        ));

        // toUnmodifiableList()
        List<String> uList =
                names.stream()
                        .collect(Collectors.toUnmodifiableList());

        // toUnmodifiableSet()
        Set<String> uSet =
                names.stream()
                        .collect(Collectors.toUnmodifiableSet());

        // toUnmodifiableMap()
        Map<String,Integer> uMap =
                names.stream()
                        .distinct()
                        .collect(Collectors.toUnmodifiableMap(
                                s -> s,
                                s -> s.length()
                        ));
    }
}
