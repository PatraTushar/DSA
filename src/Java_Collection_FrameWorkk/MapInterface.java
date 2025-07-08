package Java_Collection_FrameWorkk;

import java.util.*;

public class MapInterface {

    public static void main(String[] args) {

        // HashMap

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 90);
        map.put("DSA", 85);
        map.put("Java", 100);  // Overwrites

        System.out.println(map); // Unordered


        // LinkedHashMap

        Map<String, Integer> orderedMap = new LinkedHashMap<>();
        orderedMap.put("One", 1);
        orderedMap.put("Two", 2);
        System.out.println(orderedMap); // {One=1, Two=2}

        // TreeMap

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "B");
        treeMap.put(1, "A");
        treeMap.put(3, "C");

        System.out.println(treeMap); // {1=A, 2=B, 3=C}



    }
}
