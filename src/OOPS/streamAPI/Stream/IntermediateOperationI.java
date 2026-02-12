package OOPS.streamAPI.Stream;

import java.util.List;

public class IntermediateOperationI {

    public static void main(String[] args) {

      // 1. filter(Predicate)

        List<Integer> num=List.of(1,2,3,4,5);
        num.stream().filter(e->e%2==0).forEach(System.out::println);

        // 2. map(Function)

        List<String> names=List.of("a","bb","ccc");
        names.stream().map(String::toUpperCase).forEach(System.out::println);


        List<Integer> number=List.of(1,2,3,4);
        number.stream().map(Integer::doubleValue).forEach(System.out::println);


        // 3. mapToInt / mapToLong / mapToDouble

        List<String> words=List.of("apple","banana");
        words.stream().mapToInt(String::length).forEach(System.out::println);


        // 4. flatMap(Function)

        List<List<Integer>> nested=List.of(List.of(1,2),List.of(3,4));
        nested.stream().flatMap(List::stream).forEach(System.out::println);

    }


}
