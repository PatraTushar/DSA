package ArraysbyStriver.binarySearchPattern;

public class Q28 {

    static int findSingleElement(int[] arr) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)


        int n = arr.length;

        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];


        int start = 1;
        int end = n - 2;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) return arr[mid];

            else if ((mid % 2 != 0 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {

                start = mid + 1;
            } else end = mid - 1;
        }

        return -1;

    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(findSingleElement(arr));
    }
}
