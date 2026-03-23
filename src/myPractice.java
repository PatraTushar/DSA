

public class myPractice {

    static int search(int[] nums) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low != high) {

            int mid = low + (high - low) / 2;

            if (nums[low] >= nums[high] && nums[low] <= nums[mid]) low = mid + 1;

            else high = mid;


        }

        return low;
    }


    public static void main(String[] args) {


        int[] num = {3,4,5,1,2};

        System.out.println(search(num));

    }


}




