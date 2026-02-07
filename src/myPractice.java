import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {


    static int func(int[] nums) {

        int n = nums.length;

        int nthSum = n * (n + 1) / 2;

        int sum = 0;

        for (int ele : nums) {

            sum += ele;


        }

        return nthSum-sum;


    }


    public static void main(String[] args) {

        int[] arr = {3,0,1};
        System.out.println(func(arr));


    }


}

