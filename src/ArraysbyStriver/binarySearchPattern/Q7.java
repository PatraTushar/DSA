package ArraysbyStriver.binarySearchPattern;

public class Q7 {

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


    static int findTarget(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int n = arr.length;

        int low = 0;
        int high = 1;

        while (high < n && target > arr[high]) {

            low = high + 1;
            high = (2 * low) + 1;

            if (low >= n) return -1;
            if (high >= n) high = n - 1;

        }


        return binarySearch(arr, target, low, high);

    }

    public static void main(String[] args) {

        // Q: find the position of an element in a sorted array of infinite numbers

        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        System.out.println(findTarget(arr, target));
    }
}
