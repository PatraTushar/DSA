package Java8Features;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class basics {

    static int findSquare(int num) {

        return num * num;
    }

    static boolean isEven(int num) {

        return num % 2 == 0;

    }

    static void sayHello() {

        System.out.println(" say Hello ");
    }

    static int addition(int a, int b) {

        return a + b;
    }

    static int findLength(String s){

        return s.length();
    }


    public static void main(String[] args) {

        // 1) program to find the square of a number

        // Before Java 8
        System.out.println(findSquare(9));
        System.out.println(findSquare(7));

        // After Java 8
        Function<Integer, Integer> func = i -> i * i;
        System.out.println(func.apply(9));
        System.out.println(func.apply(7));


        // 2) program to check if the number is even or not

        // Before Java 8
        System.out.println(isEven(12));
        System.out.println(isEven(11));


        // After Java 8
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(40));
        System.out.println(p.test(19));


        // 3) Method to write "say Hello"

        // Before Java 8
        sayHello();

        // After Java 8
        Runnable r = () -> System.out.println(" hello world ");
        r.run();


        // 4) Addition of Two Numbers

        // Before Java 8
        System.out.println(addition(10,20));

        // After Java 8
       BiConsumer<Integer,Integer> r2= (a, b)-> System.out.println(a + b);
       r2.accept(20,40);


       //5)  Find length of a string

        // Before Java 8
        System.out.println(findLength("hello"));


        // After Java 8
      Function<String,Integer> getLength=s->s.length();
      int res=getLength.apply("raj");
        System.out.println(res);






    }
}
