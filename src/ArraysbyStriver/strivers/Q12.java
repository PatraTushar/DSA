package ArraysbyStriver.strivers;

public class Q12 {

    static int maximumSubArray(int[] num){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int ele : num) {

            sum += ele;

            maxSum = Math.max(sum, maxSum);

            if (sum < 0) sum = 0;


        }

        return maxSum;

    }

    public static void main(String[] args) {

        // maximum subArray(leeTCode->53)

        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray(arr));

    }
}
