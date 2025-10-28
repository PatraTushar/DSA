

public class myPractice {

    static int maximumSum(int[] arr, int k) {

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            if (right >= k - 1) {

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
        System.out.println(maximumSum(arr, k));


    }


}

