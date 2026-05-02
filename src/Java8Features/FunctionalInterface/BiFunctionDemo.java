package Java8Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;


class Employee {

    int eno;
    String name;

    Employee(int eno, String name) {

        this.eno = eno;
        this.name = name;
    }




}

public class BiFunctionDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        BiFunction<Integer, String, Employee> a = (eno, name) -> new Employee(eno, name);
        list.add(a.apply(100, "Rahul"));
        list.add(a.apply(200, "Aman"));
        list.add(a.apply(300, "Bipul"));
        list.add(a.apply(400, "Ehan"));

        for (Employee e : list) {

            System.out.println(e.eno + ":" + e.name);

        }

    }
}
