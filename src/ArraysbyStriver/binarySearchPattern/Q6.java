package ArraysbyStriver.binarySearchPattern;

import java.util.Arrays;

public class Q6 {

    static int findFirstPosition(int[] arr, int target) {

        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int first = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                first = mid;
                high = mid - 1;
            } else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;

        }

        return first;
    }


    static int findLastPosition(int[] arr, int target) {

        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int last = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                last = mid;
                low = mid + 1;
            } else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;

        }

        return last;
    }




    static int[] searchInRange(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        if (arr.length == 0) return new int[]{-1, -1};

        int[] result = new int[2];

        result[0] = findFirstPosition(arr, target);
        result[1] = findLastPosition(arr, target);

        if (result[0] != -1 && result[1] != -1) return result;

        return new int[]{-1, -1};


    }


    public static void main(String[] args) {

        // find the first and last position of element in sorted array   (leeTCode->34)

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] finalAns = searchInRange(arr, target);
        System.out.println(Arrays.toString(finalAns));
    }
}
