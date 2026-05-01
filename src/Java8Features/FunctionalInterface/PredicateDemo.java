package Java8Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employees {

    String name;
    double salary;

    Employees(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }
}



public class PredicateDemo {


    public static void main(String[] args) {

        // 1) program to check if the number is even or not

        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(40));
        System.out.println(p.test(19));

        // 2) print length >= 5

        String[] str = {"raj", "mohit", "suman", "virat", "pandya", "ben"};

        Predicate<String> p2 = name -> name.length() >= 5;

        for (String s : str) {

            if (p2.test(s)) System.out.println(s);
        }


        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("Aman", 1000));
        list.add(new Employees("Bibhu", 2000));
        list.add(new Employees("Mohan", 3000));
        list.add(new Employees("Rahul", 4000));
        list.add(new Employees("Virat", 5000));
        list.add(new Employees("Hardik", 6000));

        Predicate<Employees> p3 = e -> e.salary > 3000;

        for (Employees e1 : list) {

            if (p3.test(e1)) System.out.println(e1.name + " : " + e1.salary);
        }






    }
}
