package OopsByKK.LambdaExpression;


import java.util.function.*;

// using Lambda with All the 7 Functional Interface
public class FunctionalInterface7 {

    public static void main(String[] args) {

        //  1. Predicate<T>
        // Purpose: Takes one input, returns boolean.
        //Method: boolean test(T t)

        Predicate<Integer> p = num -> num % 2 == 0;
        System.out.println(p.test(10));
        System.out.println(p.test(21));

        // 2. Consumer<T>
        //Purpose: Takes one input, returns nothing (void).
        //Method: void accept(T t)

        Consumer<String> c = msg -> System.out.println(" Message : " + msg);
        c.accept(" I am Learning Java ");


        // 3. Function<T, R>
        //Purpose: Takes one input, returns a result.
        //Method: R apply(T t)

        Function<String, Integer> f = str -> str.length();
        System.out.println(f.apply("KL RAHUL"));

        // 4. Supplier<T>
        //Purpose: Takes no input, returns a result.
        //Method: T get()

        Supplier<Double> s = () -> Math.random();
        System.out.println(s.get());


        // 5. UnaryOperator<T>
        //Purpose: Takes one input of type T, returns same type T.
        //Method: T apply(T t)
        //(It's basically Function<T, T>)

        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(5));
        System.out.println(square.apply(6));

        // 6. BinaryOperator<T>
        //Purpose: Takes two inputs of type T, returns same type T.
        //Method: T apply(T t1, T t2)
        //(It’s basically BiFunction<T, T, T>)

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20));
        System.out.println(sum.apply(1000, 2000));


        // 7. BiFunction<T, U, R>
        //Purpose: Takes two inputs of possibly different types, returns a result.
        //Method: R apply(T t, U u)

        BiFunction<String, Integer, String> repeater = (word, times) -> word.repeat(times);
        System.out.println(repeater.apply("Hi", 3));

        // 8. BiConsumer<T, U>
        //Purpose: Takes two inputs, returns nothing.
        //Method: void accept(T t, U u)

        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name + " is " + age + " years old ");
        printDetails.accept("SURAJ", 23);

        // 9. BiPredicate<T, U>
        //Purpose: Takes two inputs, returns boolean.
        //Method: boolean test(T t, U u)

        BiPredicate<String,String> startsWith=(str,prefix)->str.startsWith(prefix);
        System.out.println(startsWith.test("java","ja"));
        System.out.println(startsWith.test("java","LA"));



    }
}
