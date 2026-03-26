package Java_Collection_FrameWork.Comparable;

import java.util.TreeSet;

public class Employee implements Comparable<Object>{

    String name;
    int eid;

    public Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }


    @Override
    public int compareTo(Object o) {

        int eid1 = this.eid;          // this.eid-> Refers to the current object (the one already inside TreeSet or being compared)
        Employee e = (Employee) o;
        int eid2 = e.eid;            // e.eid-> Refers to the incoming object (the one you are comparing with)

        if (eid1 < eid2) return -1;
        else if (eid1 > eid2) return +1;
        else return 0;
    }

    public String toString() {

        return name + " " + eid;
    }

    public static void main(String[] args) {

        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee("nag", 100));
        treeSet.add(new Employee("balaiah", 200));
        treeSet.add(new Employee("chinu", 50));
        treeSet.add(new Employee("venki", 150));
        treeSet.add(new Employee("nag", 100));

        System.out.println(treeSet);

    }



}
