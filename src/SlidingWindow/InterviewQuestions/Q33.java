package SlidingWindow.InterviewQuestions;

import java.util.HashSet;

public class Q33 {

    static int maximumUniqueSubArray(int[] num) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int n = num.length;

        HashSet<Integer> set = new HashSet<>();

        int score = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            while (set.contains(num[right])) {

                sum-=num[left];
                set.remove(num[left]);
                left++;
            }

            sum+=num[right];
            set.add(num[right]);

            score=Math.max(score,sum);


        }

        return score;
    }


    public static void main(String[] args) {

        // leeTCode->1695

        int[] num = {4, 2, 4, 5, 6};
        System.out.println(maximumUniqueSubArray(num));

    }
}
