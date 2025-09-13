package ArraysbyStriver.binarySearchPattern;

public class Q8 {

    static int peakElement(int[] arr) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int n = arr.length;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < n-1 && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) return mid;

            else if (mid > 0 && arr[mid] < arr[mid - 1]) {

                end = mid - 1;
            } else start = mid + 1;
        }

        return -1;

    }

    public static void main(String[] args) {

        // Q: Peak index in a mountain array (leeTCode->852)

        int[] arr = {3, 5, 3, 2, 0};
        System.out.println(peakElement(arr));


    }
}
