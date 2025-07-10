package Java_Collection_FrameWork.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;

    }

    public int compareTo(Student s){

        return this.marks-s.marks;
    }

    public String toString(){

        return this.name +" "+this.marks;
    }

    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student("Ram",90));
        list.add(new Student("Shyam", 80));
        list.add(new Student("Mohan", 95));

        Collections.sort(list);
        System.out.println(list);

    }


}
