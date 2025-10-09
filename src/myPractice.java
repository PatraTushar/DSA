


public class myPractice {


    static boolean findTarget(int[] nums, int target) {

        int n = nums.length;


        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return true;

            else if ((nums[mid] == nums[low]) && (nums[mid] == nums[high])) {

                {

                    low++;
                    high--;
                }


            } else if (nums[low] <= nums[mid]) {


                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }


            } else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 14;
        System.out.println(findTarget(arr, target));

    }
}







