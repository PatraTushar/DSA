package OOPS.streamAPI.LambdaExpression;
import java.util.Scanner;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

class MyStudent{
    String name;
    int age;
    MyStudent(String name,int age){

        this.name=name;
        this.age=age;
    }
}

public class biFunction {

    public static void main(String[] args) {

        //The BiFunction<T, U, R> interface takes two input arguments (of types T and U) and produces a result of type R.
        //T → type of the first input
        //U → type of the second input
        //R → type of the output (return value)

        BiFunction<String,String,Integer> obj=(x,y)->(x+y).length();
        System.out.println(obj.apply("a","bc"));

       // BiFunction<Integer,Integer,Integer> obj2=(x,y)->String.valueOf(x+y).length();--> BinaryOperator<Integer> e=(x,y)->x+y;

        BinaryOperator<Integer> obj2=(x,y)->x+y;
        System.out.println(obj2.apply(10,20));

        // Example:1 Adding Two Numbers
        BiFunction<Integer,Integer,Integer> add=(x,y)->x+y;
        System.out.println(add.apply(100,20));

        // Example:2 Concatenating Two Strings
        BiFunction<String,String,String> concat=(str1,str2)->str1 +" "+ str2;
        System.out.println(concat.apply("Hello","world"));

        // Example:3 Calculate Area of Rectangle
        BiFunction<Integer,Integer,Integer> Area=(length,breadth)->length * breadth;
        System.out.println(Area.apply(5,8));


        // Example:4  Using BiFunction to Create an Object
        BiFunction<String,Integer,MyStudent> createStudent=(name,age)->new MyStudent(name,age);
        MyStudent s=createStudent.apply("Alice",25);
        System.out.println(s.name + " is " + s.age +" years old ");

        // Example:5  Chain BiFunction with andThen()
        BiFunction<Integer,Integer,Integer> multiply=(a,b)->a * b;
        Function<Integer,String> convertToString=(result)->" Result : "+result;
        String output=multiply.andThen(convertToString).apply(3,4);
        System.out.println(output);

        // Example:6 Compare Two Strings Length
        BiFunction<String,String,String> longer=(str1,str2)->(str1.length()>str2.length()) ? str1 : str2;
        System.out.println(longer.apply("apple","banana"));  // banana

        // Example:7  Custom Calculator using BiFunction
        BiFunction<Integer,Integer,Integer> addition=(a,b)->a+b;
        BiFunction<Integer,Integer,Integer> subtraction=(a,b)->a-b;
        BiFunction<Integer,Integer,Integer> multiplication=(a,b)->a*b;
        BiFunction<Integer,Integer,Integer> division=(a,b)-> b!=0 ? a/b : 0;

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter first number ");
        int a=sc.nextInt();
        System.out.println(" enter second number ");
        int b=sc.nextInt();
        System.out.println(" enter operation (+,-,*,/) ");
        char sign=sc.next().charAt(0);

        int result=0;

        switch (sign){

            case '+': result=addition.apply(a,b);
            break;

            case '-' : result=subtraction.apply(a,b);
            break;

            case '*' : result=multiplication.apply(a,b);
            break;

            case '/' : result=division.apply(a,b);
            break;

            default:
                System.out.println(" Invalid operation ");
                break;


        }

        System.out.println(result);










    }
}
