package OopsByKK.streamAPI.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    String name;
    int rollNumber;

    Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public int compareTo(Student other){

        return this.rollNumber- other.rollNumber;


    }

    public String toString(){
        return rollNumber + " "+ name;
    }
}
public class practical {

    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student("Alice",3));
        list.add(new Student("lice",1));
        list.add(new Student("ice",2));

        Collections.sort(list);
        System.out.println(list);

        // Collections.sort() internally calls compareTo() to compare two objects.






    }
}
