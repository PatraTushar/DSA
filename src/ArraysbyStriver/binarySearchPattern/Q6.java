package ArraysbyStriver.binarySearchPattern;

import java.util.Arrays;

public class Q6 {

    static int findFirst(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                index = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {

                start = mid + 1;
            } else end = mid - 1;


        }

        return index;


    }


    static int findLast(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {

                start = mid + 1;
            } else end = mid - 1;


        }

        return ans;


    }

    static int[] searchInRange(int[] arr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        if (arr.length == 0) return new int[]{-1, -1};

        int[] result = new int[2];
        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        return result;


    }


    public static void main(String[] args) {

        // find the first and last position of element in sorted array   (leeTCode->34)

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] finalAns = searchInRange(arr, target);
        System.out.println(Arrays.toString(finalAns));
    }
}
