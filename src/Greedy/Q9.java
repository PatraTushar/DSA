package Greedy;

import java.util.Arrays;

public class Q9 {


    static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        //  Time Complexity: O(n) + O(n log n) + O(n) = o(n log n)
        //  Space Complexity: O(n)

        int n = rocks.length;

        int[] needed = new int[n];


        for (int i = 0; i < n; i++) {

            needed[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(needed);

        int count = 0;

        for (int req : needed) {

            if (additionalRocks >= req) {

                additionalRocks -= req;
                count++;
            } else break;


        }

        return count;


    }


    public static void main(String[] args) {

        // leeTCode->2279

        int[] capacity = {2, 3, 4, 5};
        int[] rocks = {1, 2, 4, 4};
        int additionalRocks = 2;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));
    }
}
