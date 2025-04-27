package OopsByKK.streamAPI.LambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class biConsumer {

    // In a BiConsumer<T, U>, you have two inputs:
    //
    //One is treated as the first input (T)
    //
    //The other is the second input (U)

    public static void main(String[] args) {

        BiConsumer<Integer,String> obj=(x,y)->{
            System.out.println(x);
            System.out.println(y);
        };

        obj.accept(100,"Kunal");

        // Example:1  Print two values

        BiConsumer<String,Integer> printNameAge=(name,age)-> System.out.println(" name : " +name + "," + " age : "+age);
        printNameAge.accept("Rohan",25);

        // Example:2  Use with a Map — Print all key-value pairs

        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);

        BiConsumer<String,Integer> printKeyVal=(key,Val)-> System.out.println(" key : "+key +","+" val :"+Val);
        map.forEach(printKeyVal);

        // Example:3  Add to List Using BiConsumer

        List<String> results=new ArrayList<>();
        BiConsumer<String,Integer> addFormatted=(word,count)->results.add(word + " appears " + count + " times ");
        addFormatted.accept("apple",3);
        addFormatted.accept("mango",5);
        System.out.println(results);

        // Example:4  BiConsumer for Updating Values in a Map

        Map<String,Integer> stock=new HashMap<>();
        stock.put("pen",10);
        stock.put("pencil",20);

        BiConsumer<String,Integer> updatedStock=(item,quantity)->
                stock.put(item,stock.getOrDefault(item,0)+quantity);

        updatedStock.accept("pen",5);
        updatedStock.accept("Eraser",7);

        System.out.println(stock);

        // Example:5  ADVANCED — Chain BiConsumer with .andThen()

        BiConsumer<String, Integer> greet = (name, age) ->
                System.out.println("Hello " + name);

        BiConsumer<String, Integer> showAge = (name, age) ->
                System.out.println(name + " is " + age + " years old");

        BiConsumer<String, Integer> combined = greet.andThen(showAge);

        combined.accept("John", 30);


        // Example:6 Use with Stream & Map — Advanced

        Map<String, Integer> scores = Map.of("Alice", 85, "Bob", 92);

        scores.forEach((name, score) -> {
            BiConsumer<String, Integer> evaluate = (n, s) -> {
                if (s >= 90) System.out.println(n + " passed with distinction");
                else if (s >= 60) System.out.println(n + " passed");
                else System.out.println(n + " failed");
            };
            evaluate.accept(name, score);
        });











    }
}
