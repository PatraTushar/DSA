package OopsByKK.streamAPI.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class Student {

    String name;
    int marks;

    Student(String name,int marks){

        this.name=name;
        this.marks=marks;
    }

}

public class consumer {


    public static void main(String[] args) {

        //Consumer<T> consumer = (T t) -> {
        //    // do something with t
        //};

        Consumer<Integer> c=(e)-> System.out.println(e);
        c.accept(45);
        List<Integer> list=List.of(1,2,3);

      Consumer<Integer> print=(e)-> System.out.println(e);
      list.forEach(print);

        // Example 1: Print a string using Consumer

        Consumer<String > names=(e)-> System.out.println(e);
        names.accept("Alice");


        // Example 2: Square a number and print

        Consumer<Integer> num=(e)-> System.out.println(e*e);
        num.accept(5);

          // Example 3: Modify and print each element in a list

        List<String> lists= Arrays.asList("bob","michael","john");
        Consumer<String> upperCase=(e)-> System.out.println(e.toUpperCase());
        lists.forEach(upperCase);

        //Example 4: Chaining Consumers using andThen()
        Consumer<String> uppercase=(e)-> System.out.println(e.toUpperCase());
        Consumer<String> exclaim=(e)-> System.out.println(e +"!!!");

        Consumer<String> combined=uppercase.andThen(exclaim);
        combined.accept("Hello");

        // Example 4: Use Consumer to modify object

        Student st=new Student("Rohan",60);

        Consumer<Student> bonus=(e)->e.marks+=10;
        Consumer<Student> printing=(e)-> System.out.println(" Student marks " +e.marks);

        bonus.andThen(printing).accept(st);

        // Example 5:Real-world Use: Logging System

        Consumer<String > info=(msg)-> System.out.println(" info :" +msg);
        Consumer<String > error=(msg)-> System.out.println(" error :" +msg);

        boolean isError=true;

        Consumer<String> logger=isError ? info : error;
        logger.accept(" Disk space is low ");








    }
}
