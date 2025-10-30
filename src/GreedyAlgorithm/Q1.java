package GreedyAlgorithm;

import java.util.Arrays;

public class Q1 {


    static int findContentChildren(int[] g, int[] s) {

        //  Time Complexity: O(n log n) + O(m log m) + O(n)
        //  Space Complexity: O(1)



        int n = s.length;
        int m = g.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int left = 0;
        int right = 0;

        while (left < n && right < m) {


            if (s[left] >= g[right]) right++;

            left++;

        }

        return right;


    }

    public static void main(String[] args) {

        // leeTCode->455

        int[] greed = {1, 5, 3, 3, 4};
        int[] s = {4, 2, 1, 2, 1, 3};
        System.out.println(findContentChildren(greed, s));
    }
}
