package ARRAYS.strivers;


import java.util.HashSet;

public class Q17 {

    static int longestConsecutiveSubsequence(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        HashSet<Integer> set = new HashSet<>();
        int longest = Integer.MIN_VALUE;

        for (int num : arr) {
            set.add(num);
        }


        for (int ele : set) {

            if (!set.contains(ele - 1)) {
                int currNum = ele;
                int count = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    count++;
                }

                longest = Math.max(longest, count);

            }


        }

        return longest;


    }

    public static void main(String[] args) {

        // Longest consecutive subsequence (leeTCode->128)


        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSubsequence(arr));


    }
}
