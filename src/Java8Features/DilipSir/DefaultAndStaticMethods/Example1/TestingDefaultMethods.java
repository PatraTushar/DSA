package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

import Java8Features.DilipSir.DefaultAndStaticMethods.Example1.ClassOne;
import Java8Features.DilipSir.DefaultAndStaticMethods.Example1.ClassTwo;

public class TestingDefaultMethods {

    public static void main(String[] args) {


        ClassOne one = new ClassOne();
        one.defaultMethodOne();
        String s = one.defaultMethodTwo();
        System.out.println(s);
        String a = one.getNames();
        System.out.println(a);
        one.printNames();


        ClassTwo two = new ClassTwo();
        two.defaultMethodOne();
        String s1 = two.defaultMethodTwo();
        System.out.println(s1);
        String b = two.getNames();
        System.out.println(b);
        two.printNames();

        ClassThree three = new ClassThree();
        three.defaultMethodOne();
        three.defaultMethodTwo();
        three.defaultMethodThree();
        three.defaultMethodFive();





    }
}
