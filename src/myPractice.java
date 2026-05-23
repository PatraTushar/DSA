import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student> {

    String name;
    int rno;

    Student(String name, int rno) {

        this.name = name;
        this.rno = rno;
    }


    @Override
    public int compareTo(Student o) {

        String s1 = o.name;
        String s2 = this.name;

        return s2.compareTo(s1);


    }

    public String toString() {

        return name + " " + rno;
    }
}

public class myPractice {

    public static void main(String[] args) {

        TreeSet<Student> t = new TreeSet<>();
        t.add(new Student("rahul", 45));
        t.add(new Student("bibhu", 38));
        t.add(new Student("mehul", 18));
        t.add(new Student("anshu", 89));
        t.add(new Student("pragyan", 78));

        System.out.println(t);


    }


}





