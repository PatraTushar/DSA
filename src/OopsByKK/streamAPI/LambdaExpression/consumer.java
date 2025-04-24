package OopsByKK.streamAPI.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {

    public static void main(String[] args) {

        //Consumer<T> consumer = (T t) -> {
        //    // do something with t
        //};

        Consumer<Integer> c=(e)-> System.out.println(e);
        c.accept(45);
        List<Integer> list=List.of(1,2,3);

        Consumer<List<Integer>> x=(e)->{
            for(int a:e){
                System.out.println(a);
            }
        };

        x.accept(list);


        // Example 1: Print a string using Consumer

        Consumer<String > names=(e)-> System.out.println(e);
        names.accept("Alice");


        // Example 2: Square a number and print

        Consumer<Integer> num=(e)-> System.out.println(e*e);
        num.accept(5);

          // Example 3: Modify and print each element in a list

        List<String> lists= Arrays.asList("bob","michael","john");
        Consumer<String> upperCase=(e)-> System.out.println(e.toUpperCase());
        lists.forEach(upperCase);






    }
}
