package OopsByKK.streamAPI.LambdaExpression;

import TREE.BinaryTree;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class biFunction {

    public static void main(String[] args) {

        BiFunction<String,String,Integer> obj=(x,y)->(x+y).length();
        System.out.println(obj.apply("a","bc"));

       // BiFunction<Integer,Integer,Integer> obj2=(x,y)->String.valueOf(x+y).length();--> BinaryOperator<Integer> e=(x,y)->x+y;

        BinaryOperator<Integer> obj2=(x,y)->x+y;
        System.out.println(obj2.apply(10,20));

    }
}
