package Java_Collection_FrameWorkk;


import java.util.*;


class Student implements Comparable<Student> {
    int marks;
    Student(int marks) { this.marks = marks; }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return "" + marks;
    }
}




public class Test {

    public static void main(String[] args) {

        // Comparable


        List<Student> list = new ArrayList<>();
        list.add(new Student(90));
        list.add(new Student(70));
        list.add(new Student(80));

        Collections.sort(list);  // uses compareTo()
        System.out.println(list); // [70, 80, 90]

    }
}
