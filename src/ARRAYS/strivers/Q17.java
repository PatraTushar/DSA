package ARRAYS.strivers;


import java.util.HashSet;

public class Q17 {

    static int longestConsecutiveSubsequence(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        HashSet<Integer> set = new HashSet<>();
        int longest = Integer.MIN_VALUE;

        for (int ele : arr) set.add(ele);

        for (int ele : arr) {

            int curr = ele;
            int count = 0;
            while (set.contains(curr)) {

                count++;
                curr--;


            }

            longest = Math.max(longest, count);


        }

        return longest;


    }

    public static void main(String[] args) {

        // Longest consecutive subsequence (leeTCode->128)


        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSubsequence(arr));


    }
}
