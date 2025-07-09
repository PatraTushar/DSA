package Java_Collection_FrameWork;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setInterface {

    public static void main(String[] args) {

        // Hashset

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicate ignored

        System.out.println(fruits);  // Order not guaranteed


        // LinkedHashset

        Set<String> items = new LinkedHashSet<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Eraser");

        System.out.println(items);  // [Pen, Pencil, Eraser]

        // TreeSet

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        System.out.println(numbers); // [10, 20, 30] — sorted order

    }
}
