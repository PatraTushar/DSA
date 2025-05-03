package OopsByKK.streamAPI.LambdaExpression.MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class staticMethodReference {

    public static void main(String[] args) {

        //A method reference follows this syntax:
        //ClassName::methodName
        //ClassName::methodName-->classname.methodName

        // Example 1: Basic Static Method Reference

        // using Lambda Expression
        BiFunction<Integer,Integer,Integer> max=(a,b)->Math.max(a,b);
        System.out.println(max.apply(10,20)); //20

        // using Method Reference
        BiFunction<Integer,Integer,Integer> maxMethodReference=Math::max;
        System.out.println(maxMethodReference.apply(200,400)); //400



        // Example 2: Now, let’s explore a more complex example using a Comparator to sort a list of objects based on a static method.

        // using Lambda Expression
        List<String> words=Arrays.asList("apple", "banana", "kiwi", "cherry");
        words.sort((a,b)->a.length()-b.length());
        System.out.println(words);
        //If a.length() - b.length() is negative, a will appear before b.
        //If it's zero, the order of a and b remains unchanged.
        //If it's positive, a will appear after b.

        // using Method Reference
        List<String> Words=Arrays.asList("cricket","football","hockey","tennis");
        Words.sort(Comparator.comparingInt(String::length));
        System.out.println(Words);

        //Example 3: You want to sort a list of integers in descending order using a static method from Integer.
        List<Integer> numbers=Arrays.asList(5,2,8,1);

        // using Lambda Expression
        numbers.sort((a,b)->b.compareTo(a));
        System.out.println(numbers);

        //using method reference

        numbers.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(numbers);












    }
}
