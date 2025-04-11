package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class combinedExample {

    public static void main(String[] args) {

        // combined example of supplier predicate consumer function

        Predicate<Integer> predicate=e->(e%2==0);
        Function<Integer,Integer> function=e->(e*e);
        Consumer<Integer> consumer=(e)-> System.out.println(e);
        Supplier<Integer> supplier=()->100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


    }
}
