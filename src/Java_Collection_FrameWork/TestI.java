package Java_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Students {
    String name;
    int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}
public class TestI {

    public static void main(String[] args) {

        // comparator

        List<Students> list = new ArrayList<>();
        list.add(new Students("Tushar", 85));
        list.add(new Students("Ravi", 90));
        list.add(new Students("Ankit", 75));

        // Sort by marks using Comparator
        Collections.sort(list, (a, b) -> a.marks - b.marks);

        System.out.println(list); // [Ankit: 75, Tushar: 85, Ravi: 90]


    }
}
