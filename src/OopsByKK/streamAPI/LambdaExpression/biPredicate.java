package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.BiPredicate;

public class biPredicate {

    public static void main(String[] args) {

        BiPredicate<Integer,Integer> sumIsEven=(x,y)->(x+y)%2==0;
        System.out.println(sumIsEven.test(10,20));

    }
}
