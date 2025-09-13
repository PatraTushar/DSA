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

        int start = 0;
        int end = 1;

        while (end < arr.length && arr[end] < target) {

            start = end + 1;
            end = (2 * start) + 1;

            if (start >= arr.length) return -1;
            if (end >= arr.length) end = arr.length - 1;


        }


        return binarySearch(arr, start, end, target);


    }

    public static void main(String[] args) {

        // Q: find the position of an element in a sorted array of infinite numbers

        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        System.out.println(findTarget(arr, target));
    }
}
