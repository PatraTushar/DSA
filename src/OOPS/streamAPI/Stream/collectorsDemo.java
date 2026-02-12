package OOPS.streamAPI.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class collectorsDemo {

    public static void main(String[] args) {

        // collectors is a utility class
        // provide a set of methods to create common collectors

        // 1. collecting to a List
        List<String> names= Arrays.asList("Alice","Bob","Charlie");
      List<String> result=  names.stream()
                .filter(e->e.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result);


        // 2.Collecting to a set
        List<Integer> num= Arrays.asList(1,2,2,3,4,4,5);
       Set<Integer> set= num.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3.collecting to a specific collection
        ArrayDeque<String> collect=names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>()));

        //4.Joining Strings
        //concatenates string element into a single string

       String concatenatedNames= names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5.Summarizing Data
        //Generates statistical summary(count,sum,min,average,max)

        List<Integer> numbers=Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(e -> e));
        System.out.println("count: "+stats.getCount());
        System.out.println("sum: "+stats.getSum());
        System.out.println("min: "+stats.getMin());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("max: "+stats.getMax());

        //6.Calculating Average
        Double average = numbers.stream().collect(Collectors.averagingInt(e -> e));
        System.out.println("Average "+average);

        //7. counting elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println(" count " +count);

        //8.Grouping elements
        List<String> words=Arrays.asList("hello","world","java","streams","collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(e->e.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(" ,"))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9.partitioning elements
        // Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(e->e.length()>5)));

        // 10.mapping and collecting
        //Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(e->e.toUpperCase(),Collectors.toList())));


        // Example 1:collecting Names by length
        List<String> l1=Arrays.asList("Anna","Bob","Alexander","Brian","Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        //Example 2: counting word by occurrences
        String sentence="hello world hello java world ";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(e->e,Collectors.counting())));

        // Example 3:Partitioning Even and Odd Numbers
        List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(e->e%2==0)));

        // Example 4:Summing values in map

        Map<String,Integer> items=new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(e->e)));

        // Example 5:Creating a map from Stream elements

        List<String> fruits=Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(e->e.toUpperCase(),e->e.length())));

        // Example 6:

        List<String> words2=Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println( words2.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y)));















    }
}
