package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.BiConsumer;

public class biConsumer {

    public static void main(String[] args) {

        BiConsumer<Integer,String> obj=(x,y)->{
            System.out.println(x);
            System.out.println(y);
        };

        obj.accept(100,"Kunal");
    }
}
