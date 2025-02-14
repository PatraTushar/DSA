package OopsByKK.LambdaFunction.Consumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> obj=(msg)-> System.out.println(" message " +msg);
        obj.accept(" hello lambda ");


    }
}
