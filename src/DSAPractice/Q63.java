package DSAPractice;

import java.util.Arrays;

public class Q63 {

    static int findMaxIndexInCols(int[][] arr, int cols) {

        int rows = arr.length;
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for (int i = 0; i < rows; i++) {

            if (arr[i][cols] > max) {

                max = arr[i][cols];
                idx = i;
            }

        }

        return idx;
    }

    static int[] peakElementII(int[][] mat) {


        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int rowIndex = findMaxIndexInCols(mat, mid);


            if ((mid == 0 || mat[rowIndex][mid] > mat[rowIndex][mid - 1]) && (mid == cols - 1 || mat[rowIndex][mid] > mat[rowIndex][mid + 1])) {

                return new int[]{rowIndex, mid};
            } else if (mat[rowIndex][mid] > mat[rowIndex][mid +1]) high = mid;

            else low = mid + 1;


        }

        return new int[]{-1, -1};
    }








    public static void main(String[] args) {

        int[][] arr = {{4, 2, 5, 1, 4, 5}, {2, 9, 3, 2, 3, 2}, {1, 7, 6, 0, 1, 3}, {3, 6, 2, 3, 7, 2}};
        int[] ans = peakElementII(arr);
        System.out.println(Arrays.toString(ans));
    }
}
