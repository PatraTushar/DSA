import java.util.HashMap;
import java.util.Stack;

public class myPractice {

    static int func(int[] nums, int k) {

        int n = nums.length;
        int maxConsecutiveOnes = 0;
        int left = 0;
        int zeroesFlip = 0;


        for (int right = 0; right < n; right++) {

            if (nums[right] == 0) zeroesFlip++;

            while (zeroesFlip > k) {

                if (nums[left] == 0) zeroesFlip--;
                left++;

            }


            int length = right - left + 1;
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, length);


        }

        return maxConsecutiveOnes;


    }

    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(func(arr, k));


    }


}

