package ARRAYS.binarySearchPattern;

public class Q32 {

    static int peakElement(int[] nums) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)


        int n = nums.length;

        int low = 0;
        int high = n - 1;

        if (n == 1) return low;

        if (nums[low] > nums[low + 1]) return low;
        if (nums[high] > nums[high - 1]) return high;

        low = low + 1;
        high = high - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid;

            else if (nums[mid] > nums[mid - 1]) low = mid + 1;

            else high = mid - 1;
        }

        return -1;


    }

    public static void main(String[] args) {


      //  leeTCode->162

        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(peakElement(arr));


    }
}
