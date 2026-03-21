import java.util.Arrays;

public class myPractice {

    static int binarySearch(int[] arr, int startPoint, int endingPoint, int target) {

        int start = startPoint;
        int end = endingPoint;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            else if (target > arr[mid]) start = mid + 1;

            else end = mid - 1;
        }

        return -1;


    }


    static int func(int[] nums, int target) {

        int n = nums.length;

        int low = 0;
        int high = 1;

        while (high < n && target > nums[high]) {

            low = high;
            high = 2 * high;


            if (high >= n) high = n - 1;


        }

        return binarySearch(nums, low, high, target);


    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        System.out.println(func(arr, target));


    }
}




