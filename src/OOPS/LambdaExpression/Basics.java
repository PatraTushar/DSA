package OOPS.LambdaExpression;


interface sayHello {

    void say();


}

interface Printer{

    void print(String message);
}

interface Calculator{

    int add(int a,int b);
}

public class Basics {

    public static void main(String[] args) {

        // 1. No parameters

        sayHello s = () -> System.out.println(" Hello world ");
        s.say();

        // 2. One parameter

        Printer p=message -> System.out.println(" Message : "+message);
        p.print("Java is fun");

        // 3. Multiple parameters + return value

        Calculator cal=(a,b)->a+b;
        System.out.println(cal.add(100,200));




    }
}
