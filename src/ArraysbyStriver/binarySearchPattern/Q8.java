package ArraysbyStriver.binarySearchPattern;

public class Q8 {

    static int peakElement(int[] arr) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int n = arr.length;

        int low = 0;
        int high = n - 1;

        if (n == 1) return low;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((mid > 0 && arr[mid] > arr[mid - 1]) && (mid < n - 1 && arr[mid] > arr[mid + 1])) return mid;

            else if ((mid < n - 1) && (arr[mid] > arr[mid + 1])) high = mid - 1;

            else low = mid + 1;
        }

        return -1;

    }

    public static void main(String[] args) {

        // Q: Peak index in a mountain array (leeTCode->852)

        int[] arr = {3, 5, 3, 2, 0};
        System.out.println(peakElement(arr));


    }
}
