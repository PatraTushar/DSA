package OopsByKK.LambdaFunction.Predicate;

import java.util.function.Predicate;
public class PredicateExample {

    public static void main(String[] args) {


        Predicate<Integer> obj=num->num%2==0;
        System.out.println(obj.test(10));
        System.out.println(obj.test(101));

    }
}

