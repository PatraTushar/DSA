package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class function {

    public static void main(String[] args) {

        // function->work for you

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
    }
}
