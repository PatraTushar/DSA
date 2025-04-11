package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.Supplier;

public class supplier {

    public static void main(String[] args) {

        Supplier<String> obj=()->"Hello World ";
        System.out.println(obj.get());

    }
}
