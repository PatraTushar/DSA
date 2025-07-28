package Hashmap.Basics;

import java.util.*;

public class BasicExample {

    static int printMaxEle(int[] arr) {

        // Time Complexity: O(n)
        //Space Complexity: O(n)

        Map<Integer, Integer> mp = new HashMap<>();

        for (int ele : arr) {

            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }

        System.out.println(mp);

        int eleAppearMaxTimes = Integer.MIN_VALUE;
        int maxKeys = Integer.MIN_VALUE;

        for (int ele : mp.keySet()) {

            if (mp.get(ele) > eleAppearMaxTimes) {


                eleAppearMaxTimes = mp.get(ele);
                maxKeys = ele;
            }


        }

        return maxKeys;
    }


    public static void main(String[] args) {

        int[] arr = {12, 2, 5, 5, 12, 2, 12, 5, 5};

        printMaxEle(arr);
        System.out.println(" The key with Maximum Frequency is " + printMaxEle(arr));


    }
}
