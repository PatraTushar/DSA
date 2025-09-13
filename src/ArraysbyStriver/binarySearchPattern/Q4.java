package ArraysbyStriver.binarySearchPattern;

public class Q4 {


    static int floor(int[] arr, int target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        if (target < arr[start]) return -1;

        else if (target > arr[n - 1]) return arr[n - 1];


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return arr[mid];

            else if (arr[mid] > target) {

                end = mid - 1;
            } else start = mid + 1;
        }

        return arr[end];


    }

    public static void main(String[] args) {

        // floor of a number

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor(arr, 15));


    }
}
