package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q34 {


    static int[] findXSum(int[] nums, int k, int x) {

        int n=nums.length;

        return new int[3];
    }



    public static void main(String[] args) {

        // leeTCode->3321

        int[] num = {1, 1, 2, 2, 3, 4, 2, 3};
        int k = 6;
        int x = 2;

        int[] result=findXSum(num,k,x);
        System.out.println(Arrays.toString(result));


    }
}
