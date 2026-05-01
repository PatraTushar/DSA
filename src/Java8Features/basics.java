package Java8Features;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }
}


public class basics {


    public static void main(String[] args) {

        // 1) program to find the square of a number

        Function<Integer, Integer> func = i -> i * i;
        System.out.println(func.apply(9));
        System.out.println(func.apply(7));


        // 2) program to check if the number is even or not


        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(40));
        System.out.println(p.test(19));


        // 3) Method to write "say Hello"


        Runnable r = () -> System.out.println(" hello world ");
        r.run();


        // 4) Addition of Two Numbers

        BiConsumer<Integer, Integer> r2 = (a, b) -> System.out.println(a + b);
        r2.accept(20, 40);


        //5)  Find length of a string


        Function<String, Integer> getLength = s -> s.length();
        int res = getLength.apply("raj");
        System.out.println(res);


        // 6) print length >= 5

        String[] str = {"raj", "mohit", "suman", "virat", "pandya", "ben"};

        Predicate<String> p2 = name -> name.length() >= 5;

        for (String s : str) {

            if (p2.test(s)) System.out.println(s);
        }


        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Aman", 1000));
        list.add(new Employee("Bibhu", 2000));
        list.add(new Employee("Mohan", 3000));
        list.add(new Employee("Rahul", 4000));
        list.add(new Employee("Virat", 5000));
        list.add(new Employee("Hardik", 6000));

        Predicate<Employee> p3 = e -> e.salary > 3000;

        for (Employee e1 : list) {

            if (p3.test(e1)) System.out.println(e1.name + " : " + e1.salary);
        }


    }
}
