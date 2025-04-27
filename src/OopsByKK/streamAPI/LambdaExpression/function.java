package OopsByKK.streamAPI.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class function {

    public static void main(String[] args) {

        // function->work for you
        //  Function<Input,output>

        Function<Integer,Integer> doubleIt=(e)->2*e;
        Function<Integer,Integer> tripleIt=(e)->3*e;
        System.out.println(doubleIt.apply(100));
        System.out.println( doubleIt.andThen(tripleIt).apply(40));
        System.out.println( doubleIt.compose(tripleIt).apply(30));
       Function<Integer,Integer> obj= Function.identity();
        System.out.println(obj.apply(85));

       // Function<Integer,Integer> a=(e)->2*e; --> UnaryOperator<Integer> v=(e)->2*e;  same meaning
        UnaryOperator<Integer> v=(e)->2*e;
        System.out.println(v.apply(2000));

        //Example 1: Square a number

        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5)); // Output: 25

        // Example 2: Length of number in digits
        Function<Integer,Integer> numLength=(e)->String.valueOf(e).length();
        System.out.println(numLength.apply(12345));

        //  Example 3: Chain Functions (Advanced)

        Function<Integer,Integer> firstDoubleIt=(e)->2*e;
        Function<Integer,Integer> TripleIt=(e)->3*e;

        System.out.println(doubleIt.andThen(tripleIt).apply(30));

        // Real-World Usage
        //Example: Stream .map() uses Function<T, R>

        List<Integer> numbers= Arrays.asList(1,2,3,4);
        Function<Integer,Integer> cube=(e)->e*e*e;

        System.out.println(numbers.stream().map(cube).collect(Collectors.toList()));

    }
}
