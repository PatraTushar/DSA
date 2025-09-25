import java.util.*;

public class myPractice {

    static int maxCountOf1sInTheRow(int[] arr, int cols) {

        int low = 0;
        int high = cols-1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1) return arr.length - mid;

            else if (arr[mid] == 1) high = mid - 1;

            else low = mid + 1;


        }

        return 0;


    }


    static int maximum1s(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int rowIndex = -1;
        int max1s = 0;

        for (int i = 0; i < rows; i++) {

            int currentRowOnes = maxCountOf1sInTheRow(arr[i], cols);

            if (currentRowOnes > max1s) {

                max1s = currentRowOnes;
                rowIndex = i;
            }


        }

        return rowIndex;
    }


    public static void main(String[] args) {

        int[][] arr = {{0, 0, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}};
        System.out.println(maximum1s(arr));


    }
}








