

public class myPractice {

    static int maximumSum(int[] arr, int k) {

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

    public static void main(String[] args) {


        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        System.out.println(maximumSum(arr, k));


    }


}

