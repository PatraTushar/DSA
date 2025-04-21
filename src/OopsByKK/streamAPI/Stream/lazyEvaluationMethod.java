package OopsByKK.streamAPI.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lazyEvaluationMethod {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Alice","Bob","charlie","David");

        Stream<String> stream=names.stream().filter(name->{
            System.out.println(" Filtering :" +name);
            return name.length()>3;

        });

        System.out.println(" before terminal operation ");

        List<String > result=stream.collect(Collectors.toList());

        System.out.println(" after terminal operation ");
        System.out.println(result);





    }
}
