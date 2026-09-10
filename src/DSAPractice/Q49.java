package DSAPractice;

public class Q49 {

    static int maximumSubArray(int[] arr) {

        int n = arr.length;
        int sum = 0;
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum < 0) {

                largestSum = Math.max(largestSum, sum);
                sum = 0;
            } else {
                largestSum = Math.max(largestSum, sum);
            }
        }

        return largestSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubArray(arr));
    }
}
