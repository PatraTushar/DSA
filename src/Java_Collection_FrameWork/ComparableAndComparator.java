package Java_Collection_FrameWork;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Object> {

    String name;
    int empID;

    Employee(String name, int empID) {

        this.name = name;
        this.empID = empID;
    }

    public String toString() {

        return name + "--" + empID;
    }


    @Override
    public int compareTo(Object obj1) {

        int e1 = this.empID;
        Employee e = (Employee) obj1;
        int e2 = e.empID;

        //this → the object calling compareTo, i.e., the incoming/new object being added to the TreeSet.
        //obj1 (parameter) → the object already in the TreeSet that we are comparing against.
        // e2.compareTo(e1)

        if (e1 < e2) return -1;
        else if (e1 > e2) return +1;
        else return 0;

    }


}


class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object obj1, Object obj2) {

        //obj1 → incoming/new object
        //obj2 → existing object in the TreeSet

        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);

    }
}

public class ComparableAndComparator {

    public static void main(String[] args) {


        TreeSet<Employee> t = new TreeSet<>();
        Employee e1 = new Employee("nag", 100);
        Employee e2 = new Employee("balaiah", 200);
        Employee e3 = new Employee("chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("nag", 100);

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);


        TreeSet<Employee> t1 = new TreeSet<>(new MyComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);


    }
}





// obj1.compareTo(obj2)  --> newElement.compareTo(existingElement)

// compare(newElement, existingElement)

// Inorder = Left → Root → Right
