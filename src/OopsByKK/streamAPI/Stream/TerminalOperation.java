package OopsByKK.streamAPI.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1.collect

        System.out.println(list.stream().skip(1).collect(Collectors.toList()));

        // 2.forEach

        list.stream().forEach(e -> System.out.println(e));

        //3.reduce : combines element to produce a single result

        System.out.println();
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        System.out.println(optionalInteger.get());

        //4.count


        //5.anyMatch,allMatch,noneMatch

        boolean b = list.stream().anyMatch(e -> e % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(e -> e > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(e -> e < 0);
        System.out.println(b2);

        // 6.findFirst,findAny

        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


        // Examples

        List<String> names=Arrays.asList("Anna","Bob","Charlie","David");
        System.out.println(names.stream().filter(e->e.length()>3).collect(Collectors.toList()));

        // Example: Squaring and sorting Numbers

        List<Integer> numbers=Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(e->e*e).sorted().collect(Collectors.toList()));

        // Example: Summing values

        List<Integer> integers=Arrays.asList(1,2,3,4,5);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        //  Example: counting occurrence of a character

        String sentence=" Hello World ";
        System.out.println(sentence.chars().filter(e->e=='l').count());

        // stateful ans stateless








    }
}
