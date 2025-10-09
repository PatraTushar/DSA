package ArraysbyStriver.binarySearchPattern;

public class Q2 {

    static int isAsc(int[] arr, int target) {

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


    static int isDesc(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == arr[mid]) return mid;

            else if (target > arr[mid]) high = mid - 1;

            else low = mid + 1;
        }

        return -1;


    }


    static int orderAgnosticBS(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        if (arr.length == 0) return -1;

        int n = arr.length;

        int low = 0;
        int high = n - 1;

        if (arr[low] <= arr[high]) {

            return isAsc(arr, target);


        } else return isDesc(arr, target);


    }


    public static void main(String[] args) {

        // order Agnostic binary search

        int[] arr1 = {1, 3, 5, 6, 9, 12, 14, 20, 33};
        int[] arr2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println(orderAgnosticBS(arr1, 20));
        System.out.println(orderAgnosticBS(arr2, 80));

    }
}
