package SlidingWindow.InterviewQuestions;

public class Q6 {

    static long countSubArrays(int[] num, int minK, int maxK) {


        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = num.length;
        int minPosition = -1;
        int maxPosition = -1;
        int culpritIndex = -1;
        long result = 0;

        for (int i = 0; i < n; i++) {

            if (num[i] < minK || num[i] > maxK) culpritIndex = i;

            if (num[i] == minK) minPosition = i;

            if (num[i] == maxK) maxPosition = i;

            int count = Math.min(minPosition, maxPosition) - culpritIndex;

            if (count > 0) result += count;


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->2444

        int[] num = {1, 3, 5, 2, 7, 5};
        int minK = 1;
        int maxK = 5;
        System.out.println(countSubArrays(num, minK, maxK));

    }
}
