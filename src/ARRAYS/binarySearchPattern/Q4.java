package ARRAYS.binarySearchPattern;

public class Q4 {


    static int floor(int[] arr, int target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) high = mid - 1;

            else {

                index = mid;
                low = mid + 1;


            }


        }

        return index;


    }

    public static void main(String[] args) {

        // floor of a number

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor(arr, 15));


    }
}
