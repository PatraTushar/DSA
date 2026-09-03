package DSAPractice;

public class Q24 {

    static int floor(int[] arr, int target) {

        int n = arr.length;

        if (target < arr[0]) return -1;
        if (target > arr[n - 1]) return n - 1;


        int low = 0;
        int high = n - 1;


        while (low <= high) {

            int mid = low + (high - low) / 2;


            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) {

                low = mid + 1;
            } else high = mid - 1;


        }

        return high;

    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor(arr, 15));
    }
}
