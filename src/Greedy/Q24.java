package Greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q24 {

    static int minOperations(int[] nums) {

        //  Time Complexity: O( n)
        //  Space Complexity: O(k) // k is the number of unique element

        int n = nums.length;


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int operations = 0;

        for (int key : map.keySet()) {

            int freq = map.get(key);

            if (freq == 1) return -1;

            while (freq != 0) {

                if (freq % 3 == 0) {

                    operations += freq / 3;
                    break;

                } else {

                    freq = freq - 2;
                    operations++;



                }


            }

        }

        return operations;


    }

    public static void main(String[] args) {

        // leeTCode->2870

        int[] arr = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        System.out.println(minOperations(arr));
    }
}
