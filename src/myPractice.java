import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class myPractice {


    public static void main(String[] args) {

        Function<String,Integer> f=str->str.length();
        System.out.println(f.apply("rahul"));

        Function<Integer,Integer> doubleIt=e->2*e;
        Function<Integer,Integer> tripeIt=e->3*e;
        Function<Integer,Integer> combine=doubleIt.andThen(tripeIt);
        System.out.println(combine.apply(10));

        System.out.println(doubleIt.compose(tripeIt).apply(20));

        Function<Integer,Integer> fq=Function.identity();
        System.out.println(fq.apply(12));

        UnaryOperator<Integer> u=e->5*e;
        System.out.println(u.apply(100));

        Function<Integer,Integer> square=e->e*e;
        System.out.println(square.apply(8));


        Function<Integer,Integer> length=e->String.valueOf(e).length();
        System.out.println(length.apply(12345));


        List<Integer> list=List.of(2,3,4,5);
        Function<Integer,Integer> ob=e->e*e*e;

        System.out.println(list.stream().map(ob).collect(Collectors.toList()));




















    }

}














