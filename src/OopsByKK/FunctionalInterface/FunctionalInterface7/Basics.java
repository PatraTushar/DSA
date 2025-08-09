package OopsByKK.FunctionalInterface.FunctionalInterface7;

import java.util.function.*;

// All 7 Functional Interface USing Anonymous Inner Class

public class Basics {

    public static void main(String[] args) {

       // 1. Predicate<T>

        // Checks if a number is even

        Predicate<Integer> isEven=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(31));


        // 2. Function<T, R>

       // Returns the length of a string

        Function<String,Integer> strLength=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(strLength.apply("Hello"));
        System.out.println(strLength.apply("Hello World"));


        // 3. Supplier<T>

        // Supplies a random double value

        Supplier<Double> randomSupplier=new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        System.out.println(randomSupplier.get());


        // 4. Consumer<T>

       // Prints a string

        Consumer<String> printer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        printer.accept("Data Structure And Algorithm");


        // 5. UnaryOperator<T>

        // Squares an integer

        UnaryOperator<Integer> square=new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num*num;
            }
        };

        System.out.println(square.apply(9));

        // 6. BinaryOperator<T>

        BinaryOperator<Integer> add=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };

        System.out.println(add.apply(100,200));

        // 7. BiFunction<T, U, R>

        BiFunction<String,String,Integer> combinedLength=new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s1, String s2) {
                return (s1+s2).length();
            }
        };

        System.out.println(combinedLength.apply("KL","RAHUL"));



    }
}
