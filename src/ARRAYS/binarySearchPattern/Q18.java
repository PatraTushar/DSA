package ARRAYS.binarySearchPattern;

public class Q18 {

    static int firstOccurrence(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)


        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {

                index = mid;
                end = mid - 1;
            } else if (target > arr[mid]) start = mid + 1;

            else end = mid - 1;


        }

        return index;


    }

    public static void main(String[] args) {

        // Q:find the first element of a given element x,given that the array is sorted .if no occurrence of x is found then return -1

        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println(firstOccurrence(arr, target));
    }
}
