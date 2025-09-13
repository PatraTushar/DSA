package ArraysbyStriver.binarySearchPattern;

public class Q3 {

    static int ceiling(int[] arr, int target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return arr[mid];

            else if (arr[mid] > target) {

                end = mid - 1;
            } else start = mid + 1;
        }

        return target > arr[n - 1] ? -1 : arr[start];
    }

    public static void main(String[] args) {

        // ceiling of a number

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }
}
