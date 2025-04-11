package OopsByKK.streamAPI.LambdaExpression.MethodReference;

import practice.Main;

import java.util.function.BiFunction;

public class arbitraryInstanceMethodReference {

    public static void main(String[] args) {

        // lambda Expression

        BiFunction<String,String,Integer> obj=(a,b)->a.compareToIgnoreCase(b);
        System.out.println(obj.apply("java","developer"));

        // Method reference

        BiFunction<String,String ,Integer> obj2= String::compareToIgnoreCase;
        System.out.println(obj2.apply("java","developer"));
    }
}
