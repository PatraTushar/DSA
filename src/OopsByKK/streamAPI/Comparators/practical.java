package OopsByKK.streamAPI.Comparators;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{

    int rollNumber;
    String name;

    Student(int rollNumber,String name){

        this.rollNumber=rollNumber;
        this.name=name;
    }

    public String toString(){
        return rollNumber +" "+name;
    }
}

// comparator to sort bt name

class sortByName implements Comparator<Student>{

   public int compare(Student a, Student b){

       return a.name.compareTo(b.name);


    }




}

// // comparator to sort bt age

class sortByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNumber-o2.rollNumber;
    }
}


public class practical {

    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student(3,"john"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list,new sortByName());
        System.out.println(list);

//        Collections.sort(list,new sortByAge());
//        System.out.println(list);







    }
}
