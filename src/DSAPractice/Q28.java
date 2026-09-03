package DSAPractice;

public class Q28 {

    static int peakElement(int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((mid > 0 && arr[mid] > arr[mid - 1]) && (mid < n - 1 && arr[mid] > arr[mid + 1])) return arr[mid];

            else if (mid > 0 && arr[mid] < arr[mid - 1]) high = mid - 1;
            else low = mid + 1;


        }

        return -1;


    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 3, 2, 0};
        System.out.println(peakElement(arr));

    }
}
