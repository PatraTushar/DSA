import java.util.Arrays;

public class myPractice {


    static int func(int[] arr, int target) {

        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                index = mid;
                high = mid - 1;
            } else if (target > arr[mid]) low = mid + 1;

            else high = mid - 1;
        }

        return index;


    }


    public static void main(String[] args) {


        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println(func(arr, target));

    }


}




