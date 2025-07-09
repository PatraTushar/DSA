package Java_Collection_FrameWork;

import java.util.*;

public class Collection_Collections_Arrays {

    public static void main(String[] args) {

        Collection<String> names=new ArrayList<>();
        names.add("Tushar");
        names.add("Rahul");

        System.out.println("Names: " + names);  // Uses Collection interface

        Collections.sort((List<String>)names); // Using utility class
        System.out.println("Sorted: " + names);

        String[] arr = {"Banana", "Apple", "Orange"};
        Arrays.sort(arr);                        // Sorting array
        System.out.println("Sorted Array: " + Arrays.toString(arr));






    }
}
