package ARRAYS.binarySearchPattern;

public class Q12 {

    static int findMin(int[] arr) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)



        int low = 0;
        int high = arr.length - 1;

        while (low != high) {

            int mid = low + (high - low) / 2;


            if (arr[low] >= arr[high] && arr[low] <= arr[mid]) {

                low = mid + 1;

            } else high = mid;


        }

        return arr[low];



    }

    public static void main(String[] args) {

        // find the minimum in rotated sorted array (leeTCode-->153)


        int[] num={3,4,5,1,2};
        System.out.println(findMin(num));



    }
}
