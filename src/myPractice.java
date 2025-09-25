import java.util.*;

public class myPractice {

    static int findMaxInColumn(int[][] arr, int rows, int colIndex) {

        int maxRow = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {

            if (arr[i][colIndex] > max) {

                max = arr[i][colIndex];
                maxRow = i;
            }
        }

        return maxRow;
    }

    static int[] peakElementII(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int maxRow = findMaxInColumn(mat, rows, mid);


            if ((mid == 0 || mat[maxRow][mid] > mat[maxRow][mid - 1]) && (mid == cols - 1 || mat[maxRow][mid] > mat[maxRow][mid + 1])) {

                return new int[]{maxRow, mid};


            } else if (mat[maxRow][mid] > mat[maxRow][mid + 1]) {

                high = mid;
            } else low = mid + 1;
        }

        return new int[]{-1, -1};


    }


    public static void main(String[] args) {

        int[][] arr = {{4, 2, 5, 1, 4, 5}, {2, 9, 3, 2, 3, 2}, {1, 7, 6, 0, 1, 3}, {3, 6, 2, 3, 7, 2}};
        int[] ans = peakElementII(arr);
        System.out.println(Arrays.toString(ans));


    }
}








