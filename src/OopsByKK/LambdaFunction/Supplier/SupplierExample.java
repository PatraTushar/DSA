package OopsByKK.LambdaFunction.Supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> obj=()-> Math.random();
        System.out.println(" random number is " +obj.get());

    }
}
