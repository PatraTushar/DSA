package ArraysbyStriver.binarySearchPattern;

public class Q10 {


    static int binarySearch(int[] arr, int start, int end, int target) {


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) start = mid + 1;

            else end = mid - 1;
        }

        return -1;

    }


    static int findPivotIndex(int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low != high) {

            int mid = low + (high - low) / 2;

            if (arr[low] < arr[mid]) low = mid;

            else high = mid;
        }

        return low;
    }


    static int findTarget(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int n = arr.length;
        int pivotIndex = findPivotIndex(arr);

        int firstPart = binarySearch(arr, 0, pivotIndex, target);
        int secondPart = binarySearch(arr, pivotIndex + 1, n - 1, target);

        if (firstPart != -1) return firstPart;
        else return secondPart;

    }

    public static void main(String[] args) {

        // search in rotated sorted array (leeTCode-->33)

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(" target is in index " + findTarget(arr, target));
    }
}
