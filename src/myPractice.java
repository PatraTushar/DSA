import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class myPractice {


    public static class Student {

        String name;
        int age;

        Student(String name, int age) {

            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age;
        }
    }

    static class sortByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }


    }


    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("bob", 45));
        list.add(new Student("Alice", 23));
        list.add(new Student("ror", 9));
        list.add(new Student("tom", 12));

        Collections.sort(list, new sortByName());
        System.out.println(list);


    }

}








