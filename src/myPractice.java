import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class myPractice {


    static int func(int[] nums) {

        int maxConsecutiveOnes = 0;
        int count = 0;

        for (int ele : nums) {

            if (ele == 1) count++;

            else {

                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);

                count = 0;
            }


        }

        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);

        return maxConsecutiveOnes;

    }


    public static void main(String[] args) {

        int[] arr = {1,1,0,0,0,1,1,1,1,1,1,0};
        System.out.println(func(arr));


    }


}

