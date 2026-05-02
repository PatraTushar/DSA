package Java8Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class MyEmployee {

    String name;
    double salary;

    MyEmployee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }


}


public class BiConsumerDemo {

    static void populate(ArrayList<MyEmployee> l) {

        l.add(new MyEmployee("Rahul", 1000));
        l.add(new MyEmployee("Mehul", 2000));
        l.add(new MyEmployee("Virat", 3000));
        l.add(new MyEmployee("Hardik", 4000));


    }


    public static void main(String[] args) {

        ArrayList<MyEmployee> list = new ArrayList<>();
        populate(list);

        BiConsumer<MyEmployee, Double> b = (e, d) -> e.salary += d;

        for (MyEmployee e : list) {

            b.accept(e, 500.00);
        }


        for (MyEmployee e : list) {

            System.out.println(e.name + ":" + e.salary);
        }


    }
}
