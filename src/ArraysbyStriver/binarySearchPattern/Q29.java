package ArraysbyStriver.binarySearchPattern;

public class Q29 {


    // BRUTE FORCE APPROACH
    static int findKthPositive(int[] arr, int k) {

        // Time Complexity: O( n)
        // Space Complexity: O(1)

        for (int ele : arr) {

            if (ele <= k) k++;

            else break;
        }

        return k;

    }


    static int kthMissing(int[] arr, int k) {

        // leeTCode->1539

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

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


        return (low + k);


    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(kthMissing(arr, k));


    }
}
