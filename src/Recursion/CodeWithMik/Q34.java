package Recursion.CodeWithMik;

public class Q34 {

    static int solve(int[] num, int target, int index) {

        // dp question

        if (target == 0) return 1;

        if (index >= num.length || target < 0) return 0;


        int take = solve(num, target - num[index], 0);
        int reject = solve(num, target, index + 1);

        return take + reject;

    }


    static int combinationSum4(int[] nums, int target) {


        return solve(nums,target,0);


    }


    public static void main(String[] args) {

       // leeTCode->377

        int[] nums = {1, 2, 3};
        int target = 4;

        System.out.println(combinationSum4(nums, target));


    }
}
