package Greedy;

import java.util.Arrays;

public class Q6 {

    static int earliestFullBloom(int[] plantTime, int[] growTime) {

        //  Time Complexity: O(n log n) + O(n)
        //  Space Complexity: O(n)


        int n = plantTime.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;


        Arrays.sort(idx, (a, b) -> growTime[b] - growTime[a]);

        int currDay = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int index = idx[i];
            currDay += plantTime[index];
            ans = Math.max(ans, currDay + growTime[index]);
        }

        return ans;


    }

    public static void main(String[] args) {

        // leeTCode->2136

        int[] plantTime = {1, 4, 3};
        int[] growTime = {2, 3, 1};
        System.out.println(earliestFullBloom(plantTime, growTime));

    }
}
