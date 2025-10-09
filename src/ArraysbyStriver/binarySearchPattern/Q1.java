package ArraysbyStriver.binarySearchPattern;

public class Q1 {

    static int binarySearch(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == arr[mid]) return mid;

            else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;
        }

        return -1;

    }

    public static void main(String[] args) {

        // Binary Search (leeTCode->35)

        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
