import java.util.Arrays;
import java.util.HashMap;

public class myPractice {


    static int func(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

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

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = func(arr);
        System.out.println(ans);


    }


}

