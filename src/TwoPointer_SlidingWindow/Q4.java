package TwoPointer_SlidingWindow;

public class Q4 {

    static int maxScore(int[] cardPoints, int k) {

        // Time Complexity: O(2k)->O(k)
        // Space Complexity: O(1)

        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int right = n - 1;
        int index = -1;

        if (k == 1) return Math.max(cardPoints[0], cardPoints[right]);

        for (int left = 0; left < k; left++) {

            leftSum += cardPoints[left];
            maxSum = Math.max(maxSum, leftSum);
            index = left;

        }


        for (int i = index; i >= 0; i--) {

            leftSum -= cardPoints[i];
            rightSum += cardPoints[right--];
            maxSum = Math.max(maxSum, leftSum + rightSum);

        }

        return maxSum;

    }

    public static void main(String[] args) {

        // leeTCode->1423

        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        System.out.println(maxScore(arr, k));
    }
}
