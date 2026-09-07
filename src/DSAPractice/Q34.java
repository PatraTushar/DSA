package DSAPractice;

public class Q34 {

    static int firstOccurrence(int[] arr, int target) {

        int n = arr.length;
        int idx = -1;

        int low = 0;
        int high = n - 1;

        while (low <= high) {


            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                idx = mid;
                high = mid - 1;

            } else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return idx;


    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println(firstOccurrence(arr, target));
    }
}
