package Java8Features.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> c = s -> System.out.println(s);
        c.accept("virat");


        //  how can u combine multiple functional interface

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


        Predicate<Student> p = i -> i.marks >= 60;

        Consumer<Student> c1 = x -> {

            System.out.println(" student name " + x.name);
            System.out.println(" student marks " + x.marks);
            System.out.println(" student grade " + s1.apply(x));
            System.out.println();
        };

        for (Student s3 : student) {

            c1.accept(s3);
        }


    }
}
