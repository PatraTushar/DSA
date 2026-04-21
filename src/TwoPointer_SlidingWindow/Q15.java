package TwoPointer_SlidingWindow;

public class Q15 {

    static double findMaxAverage(int[] nums, int k) {

        int length = nums.length;

        double sum = 0;
        double maxSum = Integer.MIN_VALUE;
        int left = 0;

        for (int right = 0; right < length; right++) {

            sum += nums[right];

            if ((right - left + 1) == k) {

                double avgValue=sum/k;
                maxSum = Math.max(maxSum, avgValue);
                sum -= nums[left];
                left++;
            }


        }

        return maxSum;
    }

    public static void main(String[] args) {

        // leeTCode->643

        int[] arr = {-1, 12, -5, -6, 50,3};
        int k = 4;
        System.out.println(findMaxAverage(arr, k));

    }
}
