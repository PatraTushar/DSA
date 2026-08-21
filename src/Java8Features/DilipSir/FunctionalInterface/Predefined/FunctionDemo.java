package Java8Features.DilipSir.FunctionalInterface.Predefined;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionDemo {

    public static void main(String[] args) {

        // Req:Find haf value from given value
        Function<Integer, Double> halfVal = e -> e / 2.0;
        System.out.println(halfVal.apply(20));


        //Req:Given String Should be converted to uppercase
        Function<String, String> funcToUpperCase = String::toUpperCase;
        System.out.println(funcToUpperCase.apply("shweta"));


        Function<Integer, Integer> add = e -> e + 2;
        Function<Integer, Integer> multiply = e -> e * 5;


        // default Method: addThen() : First current function → then the function passed to andThen()
        System.out.println(add.andThen(multiply).apply(10));

        // default Method: compose() : First the function passed to compose() → then the current function
        System.out.println(add.compose(multiply).apply(10));


        // Static Method: identity()
        Function<Integer, Integer> identicalValue = Function.identity();
        System.out.println(identicalValue.apply(100));


        // Stream API
        // Stream Object: From that i have to collect all values as a list
        Stream<String> names = Stream.of("one", "two", "three");
        List<String> values=names.map(Function.identity()).collect(Collectors.toList());
        System.out.println(values);


    }
}
