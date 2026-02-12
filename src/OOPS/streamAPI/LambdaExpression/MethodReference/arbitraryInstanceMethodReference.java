package OOPS.streamAPI.LambdaExpression.MethodReference;

//import practice.Main;

import java.util.function.BiFunction;

public class arbitraryInstanceMethodReference {

    public static void main(String[] args) {

        // lambda Expression

        BiFunction<String,String,Integer> obj=(a,b)->a.compareToIgnoreCase(b);    // compareToIgnoreCase-->It only compares the 1st character from both strings:
        System.out.println(obj.apply("java","developer"));

        //'j' = 106(ascii)
        //'d' = 100(ascii)
        //106 - 100 = 6

        // Method reference

        BiFunction<String,String ,Integer> obj2= String::compareToIgnoreCase;
        System.out.println(obj2.apply("java","developer"));
    }
}
