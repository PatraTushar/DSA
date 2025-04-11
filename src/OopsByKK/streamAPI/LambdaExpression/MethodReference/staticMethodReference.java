package OopsByKK.streamAPI.LambdaExpression.MethodReference;

import java.util.function.BiFunction;

public class staticMethodReference {

    public static void main(String[] args) {

        // lambda Expression

        BiFunction<Integer,Integer,Integer> obj=(a,b)->Math.max(a,b);
        System.out.println(obj.apply(10,20));

        // method Reference

        BiFunction<Integer,Integer,Integer> obj2=Math::max;
        System.out.println(obj2.apply(50,60));


    }
}
