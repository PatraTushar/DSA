package OopsByKK.streamAPI.LambdaExpression;

import TREE.BinaryTree;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

class student{
    String name;
    int age;
    student(String name,int age){

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

        BiFunction<String,Integer,student> createStudent=(name,age)->new student(name,age);
        student s=createStudent.apply("Alice",25);
        System.out.println(s.name + " is " + s.age +" years old ");






    }
}
