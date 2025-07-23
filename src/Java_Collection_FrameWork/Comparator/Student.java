package Java_Collection_FrameWork.Comparator;

import java.util.Comparator;
import java.util.*;

public class Student {

    String name;
    int marks;

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }


    public String toString() {

        return this.name + " : " + this.marks;
    }


}

class sortByMarks implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}

class NameComparator implements Comparator<Student> {


    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }


    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Ram", 90));
        list.add(new Student("Shyam", 80));
        list.add(new Student("Mohan", 95));

        Collections.sort(list, new NameComparator());
        System.out.println(list);

        Student[] arr = new Student[]{new Student("rahul", 100), new Student("Ayush", 80), new Student("charles", 90)};
        Arrays.sort(arr,new sortByMarks());
        System.out.println(Arrays.toString(arr));



    }

}
