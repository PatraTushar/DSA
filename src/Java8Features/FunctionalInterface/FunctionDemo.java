package Java8Features.FunctionalInterface;


import java.util.function.Function;
import java.util.function.Predicate;


class Student {

    String name;
    int marks;

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }

}

public class FunctionDemo {

    public static void main(String[] args) {

        // 1) find square of a number
        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(4));

        // 2) find length of a string
        Function<String, Integer> s = i -> i.length();
        System.out.println(s.apply("Rohit"));


        // 3) convert the string to uppercase
        Function<String, String> u = i -> i.toUpperCase();
        System.out.println(u.apply("varun"));

        // write a function fo find the grade of a student

        Student[] student = {new Student("Durga", 100),
                new Student("Sunny", 65),
                new Student("Bunny", 55),
                new Student("Chinny", 45),
                new Student("Vinny", 25)};

        Function<Student, String> s1 = i -> {

            int marks = i.marks;
            String grade = "";

            if (marks >= 80) grade = "A";
            else if (marks >= 60) grade = "B";
            else if (marks >= 50) grade = "C";
            else if (marks >= 35) grade = "D";
            else grade = "E";

            return grade;
        };


        for (Student e : student) {

            System.out.println(" Student name " + e.name);
            System.out.println(" Student marks " + e.marks);
            System.out.println(" Student grade " + s1.apply(e));

            System.out.println();

        }


        // student marks >=60

        Predicate<Student> p = i -> i.marks >= 60;

        for (Student s2 : student) {

            if (p.test(s2)) {

                System.out.println(" name " + s2.name + " marks " + s2.marks + " grade " + s1.apply(s2));
                System.out.println();
            }
        }


        // andThen() and compose()
        // f.andThen(g):first f runs → then g runs
        //f.compose(g):first g runs → then f runs

        Function<Integer,Integer> multiplyBy2=i->2*i;
        Function<Integer,Integer> add3=i->i+3;
        System.out.println(multiplyBy2.andThen(add3).apply(10));
        System.out.println(multiplyBy2.compose(add3).apply(10));


    }
}
