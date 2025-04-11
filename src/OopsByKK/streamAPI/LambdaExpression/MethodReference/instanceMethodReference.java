package OopsByKK.streamAPI.LambdaExpression.MethodReference;

import java.util.function.Consumer;

public class instanceMethodReference {

    public static void main(String[] args) {

        // lambda expression

        Consumer<String> obj=(e)-> System.out.println(e);
        obj.accept(" Hello lambda ");

        // Method Reference

        Consumer<String> obj2= System.out::println;
        obj2.accept(" hello lambda of method reference ");
    }
}
