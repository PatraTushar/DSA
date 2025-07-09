package Java_Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class ListInterface {

    public static void main(String[] args) {

        // ArrayList

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Java");  // Duplicates allowed

        System.out.println(list); // [Java, C++, Java]


        // LinkedList

        List<String> linked = new LinkedList<>();
        linked.add("DSA");
        linked.add("Java");

        linked.add(1, "OS"); // Insert at index
        System.out.println(linked); // [DSA, OS, Java]


        // Vector

        Vector<String> v = new Vector<>();
        v.add("One");
        v.add("Two");
        System.out.println(v); // [One, Two]

        // Stack

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());  // 20




    }
}
