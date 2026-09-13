package DSAPractice;

import java.util.HashSet;

public class Q53 {

    static int longestConsecutiveSubsequence(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for (int ele : arr) {
            set.add(ele);
        }


        for (int ele : arr) {

            if (!set.contains(ele - 1)) {

                int curr = ele;
                int length = 0;

                while (set.contains(curr)) {

                    length++;
                    curr++;
                }

                longest = Math.max(longest, length);

            }


        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSubsequence(arr));
    }
}
