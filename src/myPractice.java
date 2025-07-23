import OopsByKK.AccessModifier.Public.A;

import java.util.Arrays;
import java.util.Comparator;

public class myPractice {

    static class Student {

        String name;
        int marks;

        Student(String name, int marks) {

            this.name = name;
            this.marks = marks;
        }


        public String toString() {

            return this.name + " " + this.marks;
        }

    }

    static class ClassComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }


    public static void main(String[] args) {

        Student[] arr = new Student[]{new Student("rohan", 12), new Student("bob", 1), new Student("alan", 25)};
        Arrays.sort(arr,new ClassComparator());
        System.out.println(Arrays.toString(arr));


    }


}
