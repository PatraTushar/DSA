public class myPractice {


    static int func(int[] arr, int k) {

        int length = arr.length;
        int leftSum = 0;
        int rightSum = 0;
        int right = length - 1;
        int maxSum = Integer.MIN_VALUE;
        int idx = -1;


        for (int left = 0; left < k; left++) {

            leftSum += arr[left];
            maxSum = Math.max(maxSum, leftSum);
            idx = left;


        }


        for (int i = idx; i >= 0; i--) {

            leftSum -= arr[i];
            rightSum += arr[right--];
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum;

    }


    public static void main(String[] args) {


        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        System.out.println(func(arr, k));

    }


}





