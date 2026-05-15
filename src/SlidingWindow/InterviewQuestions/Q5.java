package SlidingWindow.InterviewQuestions;

import java.util.HashSet;

public class Q5 {

    static boolean containsNearByDuplicate(int[] num, int k) {

        // Time Complexity: O(n)
        // Space Complexity: O(k)  at any point, the HashSet stores at most k elements (sliding window of size k).

        int n = num.length;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < n; right++) {


            if (right - left > k) {

                set.remove(num[left]);
                left++;

            }


            if (set.contains(num[right])) return true;

            set.add(num[right]);

        }

        return false;

    }

    public static void main(String[] args) {

        // leeTCode->219

        int[] num = {1, 2, 3, 4};
        int k = 3;
        System.out.println(containsNearByDuplicate(num, k));


    }
}
