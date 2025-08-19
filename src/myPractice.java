

public class myPractice {

    static int subArraysWithSum(int[] nums, int goal) {
        return subArraysWithSumLessThanEqualToGoal(nums, goal) - subArraysWithSumLessThanEqualToGoal(nums, goal - 1);
    }


    static int subArraysWithSumLessThanEqualToGoal(int[] nums, int goal) {

        if (goal < 0) return 0;

        int n = nums.length;
        int count = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {

            sum += nums[right];


            while (sum > goal) {

                sum -= nums[left];
                left++;
            }

            count += (right - left + 1);


        }

        return count;
    }



    public static void main(String[] args) {


    }

}














