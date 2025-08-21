import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class myPractice {

    public static void main(String[] args) {

        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        System.out.println(p.test(200));
        System.out.println(p.test(191));

        Consumer<Integer> c=new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {

                System.out.println(num);

            }
        };

        c.accept(400);


        Function<String,Integer> f=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return s.length();
            }
        };

        System.out.println(f.apply("hello"));


        Supplier<Integer>s=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 123;
            }
        };

        System.out.println(s.get());




    }
}











