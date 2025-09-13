package ArraysbyStriver.binarySearchPattern;

public class Q2 {

    static int binarySearchAsc(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] > target) {

                end = mid - 1;


            } else start = mid + 1;
        }

        return -1;
    }

    static int binarySearchDesc(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] > target) {


                start = mid + 1;


            } else end = mid - 1;

        }

        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        if (arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {

            return binarySearchAsc(arr, target);
        }


        return binarySearchDesc(arr, target);


    }


    public static void main(String[] args) {

        // order Agnostic binary search

        int[] arr1 = {1, 3, 5, 6, 9, 12, 14, 20, 33};
        int[] arr2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println(orderAgnosticBS(arr1, 20));
        System.out.println(orderAgnosticBS(arr2, 80));

    }
}
