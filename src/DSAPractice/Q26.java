package DSAPractice;

import java.util.Arrays;

public class Q26 {

    static int firstPosition(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int idx = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == arr[mid]) {

                idx = mid;
                high = mid - 1;
            } else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;


        }

        return idx;
    }


    static int lastPosition(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int idx = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == arr[mid]) {

                idx = mid;
                low = mid + 1;
            } else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;


        }

        return idx;
    }

    static int[] searchInRange(int[] arr, int target) {

        int[] result = new int[2];

        result[0] = firstPosition(arr, target);
        result[1] = lastPosition(arr, target);

        return result;


    }


    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] finalAns = searchInRange(arr, target);
        System.out.println(Arrays.toString(finalAns));
    }
}
