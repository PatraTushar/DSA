package DSAPractice;

public class Q27 {

    static int binarySearch(int[] arr, int target, int low, int high) {


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }

        return -1;

    }

    static int findTarget(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = 1;

        while (high < n &&  target > arr[high]) {

            low = high;
            high = 2 * high;

            if (high >= n) {

                high = n - 1;
            }
        }

        return binarySearch(arr, target, low, high);


    }

    public static void main(String[] args) {


        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        System.out.println(findTarget(arr, target));
    }
}
