package ARRAYS.strivers;

public class Q12 {

    static int maximumSubArray(int[] num) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i < num.length; i++) {

            sum += num[i];

            if (sum < 0) {

                maxSum = Math.max(maxSum, sum);
                sum = 0;
            } else {

                maxSum = Math.max(maxSum, sum);

            }


        }


        return maxSum;

    }

    public static void main(String[] args) {

        // maximum subArray(leeTCode->53)

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubArray(arr));

    }
}
