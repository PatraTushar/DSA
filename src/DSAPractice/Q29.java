package DSAPractice;

public class Q29 {

    static int findTarget(int[] nums, int target) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            else if (nums[low] < nums[mid] && (target >nums[mid])) {

              low=mid+1;

            } else  high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        System.out.println(" target is in index " + findTarget(arr, target));
    }
}
