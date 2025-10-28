

public class myPractice {

    static int func(int[] nums, int target) {

        int n = nums.length;
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            sum += nums[right];


            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;

            }


        }


        return minLength == Integer.MAX_VALUE ? 0 : minLength;


    }

    public static void main(String[] args) {


        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;
        System.out.println(func(arr, k));


    }


}

