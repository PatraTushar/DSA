package DSAPractice;

public class Q21 {

    static int binarySearch(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }

        return -1;


    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
