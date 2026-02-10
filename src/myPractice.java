import java.util.Arrays;
import java.util.HashMap;

public class myPractice {


    static int func(int[] nums) {

        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == majority) count++;

            else {

                count--;

                if (count == 0) {

                    majority = nums[i];
                    count = 1;
                }
            }


        }

        return majority;


    }


    public static void main(String[] args) {

        int[] arr = {2,2,3,3,1,2,2};
        int ans=func(arr);
        System.out.println(ans);


    }


}

