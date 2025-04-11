package OopsByKK.streamAPI.LambdaExpression;

import java.util.List;
import java.util.function.Consumer;

public class consumer {

    public static void main(String[] args) {

        Consumer<Integer> c=(e)-> System.out.println(e);
        c.accept(45);
        List<Integer> list=List.of(1,2,3);

        Consumer<List<Integer>> x=(e)->{
            for(int a:e){
                System.out.println(a);
            }
        };

        x.accept(list);


    }
}
