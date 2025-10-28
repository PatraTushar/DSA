package TwoPointer_SlidingWindow;


public class Q1 {


    // BRUTEFORCE APPROACH
    static int maxSumInWindow(int[] arr, int k) {

        // Time Complexity: O(n * k)
        //  Space Complexity: O(1)


        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i <= n - k; i++) {

            int sum = 0;
            for (int j = i; j < k + i; j++) {

                sum += arr[j];
                maxSum = Math.max(sum, maxSum);


            }

        }

        return maxSum;


    }

    // OPTIMAL APPROACH
    static int maximumInWindowI(int[] arr, int k) {

        // Time Complexity: O(n)
        //  Space Complexity: O(1)

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            if ((right - left + 1) == k) {

                maxSum = Math.max(maxSum, sum);
                sum -= arr[left];
                left++;


            }


        }

        return maxSum;


    }

    public static void main(String[] args) {

        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;

        System.out.println(maxSumInWindow(arr, k));

        System.out.println(maximumInWindowI(arr, k));
    }
}
