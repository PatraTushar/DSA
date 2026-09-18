package DSAPractice;

public class Q64 {

    static int findSmallerThanEqualTo(int[] arr, int target) {

        int cols = arr.length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) high = mid - 1;

            else low = mid + 1;

        }

        return low;


    }

    static int findMedian(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int totalElement = rows * cols;
        int median = totalElement / 2;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;


        for (int i = 0; i < rows; i++) {

            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][cols - 1]);

        }


        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            for (int i = 0; i < rows; i++) {

                count += findSmallerThanEqualTo(mat[i], mid);
            }


            if (count <= median) low = mid + 1;

            else high = mid - 1;


        }

        return low;


    }

    public static void main(String[] args) {

        int[][] arr = {{1, 5, 7, 9, 11}, {2, 3, 4, 5, 10}, {9, 10, 12, 14, 16}};
        System.out.println(findMedian(arr));
    }
}
