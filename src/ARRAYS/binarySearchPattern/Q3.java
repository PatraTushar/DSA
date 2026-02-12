package ARRAYS.binarySearchPattern;

public class Q3 {

    static int ceiling(int[] arr, int target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid];

            else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;


        }

        return target > arr[n - 1] ? -1 : arr[low];
    }

    public static void main(String[] args) {

        // ceiling of a number

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }
}
