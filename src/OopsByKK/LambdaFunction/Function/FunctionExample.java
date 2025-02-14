package OopsByKK.LambdaFunction.Function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer,String> obj=num->"Number" +num;
        System.out.println(obj.apply(10));



    }
}
