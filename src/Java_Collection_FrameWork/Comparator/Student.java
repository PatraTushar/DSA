package Java_Collection_FrameWork.Comparator;

import java.util.Comparator;
import java.util.TreeSet;




class Student {

    String name;
    int eid;

    Student(String name, int eid) {

        this.name = name;
        this.eid = eid;
    }


    @Override
    public String toString() {
        return name + " : " + eid;
    }




}


class myComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {


        String s1 = o1.name;
        String s2 = o2.name;

        return s1.compareTo(s2);

    }



}


class Main{


    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>(new myComparator());

        treeSet.add(new Student("nag", 100));
        treeSet.add(new Student("balaiah", 200));
        treeSet.add(new Student("chinu", 50));
        treeSet.add(new Student("venki", 150));
        treeSet.add(new Student("nag", 100));   // duplicate
        treeSet.add(new Student("nag", 200));   // allowed

        for (Student s : treeSet) {
            System.out.println(s);
        }
    }


}

