package Java8Features.DilipSir.FunctionalInterface.UserDefined;

import Java8Features.DilipSir.FunctionalInterface.UserDefined.Calculate;
import Java8Features.DilipSir.FunctionalInterface.UserDefined.ClassOne;
import Java8Features.DilipSir.FunctionalInterface.UserDefined.calculationOperation;

public class Demo {

    public static void main(String[] args) {

        Calculate c = new ClassOne();
        c.printName();

        // using lambda expression

        Calculate c1 = () -> {

            System.out.println(" lambda expression ");


        };

        c1.printName();


        calculationOperation add = (a, b) -> {

            System.out.println(" values are " + a + " " + b);

            return a + b;
        };

        double result = add.operation(10, 20);
        System.out.println(" sum is " + result);


        calculationOperation subtract = (x, y) -> {

            System.out.println(" values are " + x + " " + y);

            return x - y;

        };

        double res = subtract.operation(100, 30);
        System.out.println(" subtraction is " + res);


        calculationOperation multiplication = (a, b) -> a * b;
        double ans = multiplication.operation(200, 5);
        System.out.println(ans);

        // execute default method
        multiplication.printInfo();

        // execute static method


    }
}
