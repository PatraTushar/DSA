package ArraysbyStriver.strivers;

public class Q31 {

    static int kthMissing(int[] arr, int k) {

        //Time Complexity: O(log N)
        //Space Complexity: O(1)

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);


            if (missing < k) {

                low = mid + 1;
            } else high = mid - 1;
        }

        return k + low;


    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(kthMissing(arr, k));
    }
}
