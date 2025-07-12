
package Java_Collection_FrameWork.Comparable;


import java.util.*;

public class Student implements Comparable<Student> {

    String name;
    int marks;

    public Student(String name, int marks) {

        this.name = name;
        this.marks = marks;

    }

    public int compareTo(Student s) {


        return this.marks - s.marks;
    }

    public String toString() {

        return this.name + " " + this.marks;
    }

    public static void main(String[] args) {

        Student[] arr = new Student[]{new Student("rahul", 100), new Student("Ayush", 80), new Student("charles", 90)};
        //“We passed Student[] into Arrays.sort(), so internally T is replaced by Student.”
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        List<Student> list = new ArrayList<>();
        list.add(new Student("Ram", 90));
        list.add(new Student("Shyam", 80));
        list.add(new Student("Mohan", 95));

        Collections.sort(list);
        System.out.println(list);

    }


}
