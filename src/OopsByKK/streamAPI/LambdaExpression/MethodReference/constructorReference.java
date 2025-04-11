package OopsByKK.streamAPI.LambdaExpression.MethodReference;

import java.util.*;
import java.util.function.Supplier;

public class constructorReference {

    public static void main(String[] args) {

        // lambda expression

        Supplier<List<String>> obj=()->new ArrayList<>();
        System.out.println(obj.get());

        // constructor reference

        Supplier<List<String>> obj2=ArrayList::new;
        System.out.println(obj2.get());



    }
}
