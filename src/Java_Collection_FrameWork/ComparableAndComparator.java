package Java_Collection_FrameWork;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

    String name;
    int age;

    public Employee(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String toString() {

        return name + " : " + age;
    }


    @Override
    public int compareTo(Employee e) {


        int e1 = this.age;
        int e2 = e.age;

        //this → the object calling compareTo, i.e., the incoming/new object being added to the TreeSet.
        //e (parameter) → the object already in the TreeSet that we are comparing against.


        if (e1 > e2) return +1;
        else if (e1 < e2) return -1;
        else return 0;


    }
}

class myComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        //e1 → incoming/new object
        //e2 → existing object in the TreeSet


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


        TreeSet<Employee> t1 = new TreeSet<>(new myComparator());
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
