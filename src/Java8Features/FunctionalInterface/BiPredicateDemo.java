package Java8Features.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> a =(x,y)->(x+y)%2==0;
        System.out.println(a.test(10,20));
        System.out.println(a.test(11,16));
    }
}
