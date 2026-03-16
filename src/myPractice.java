import java.util.Arrays;
import java.util.Map;

public class myPractice {

    static int func(int[] nums) {


        int n = nums.length;
        int idx = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] != nums[i - 1]) {

                nums[idx++]=nums[i];

            }
        }

        return idx;

    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(func(arr));


    }
}




