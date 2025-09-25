package ArraysbyStriver.strivers;

public class Q28 {

    static int maximum1s(int[][] arr) { // brute force approach

        //Time Complexity: O(m * n)
        //Space Complexity: O(1)

        int rows = arr.length;
        int cols = arr[0].length;

        int max1s = 0;
        int rowIndex = -1;

        for (int i = 0; i < rows; i++) {


            int count1s = 0;

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == 1) count1s++;


            }

            if (count1s > max1s) {

                max1s = count1s;
                rowIndex = i;
            }


        }

        return rowIndex;

    }

    static int findMaximum1sInTheRow(int[][] arr) {  // optimal approach

        //Time Complexity: O(m * log n)
        //Space Complexity: O(1)

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

    static int maxCountOf1sInTheRow(int[] arr, int cols) {


        int low = 0;
        int high = cols - 1;


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1) {
                return arr.length - mid;

            } else if (arr[mid] == 1) {
                high = mid - 1;
            } else low = mid + 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        // Rows with maximum number of 1s

        int[][] arr = {{0, 0, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}};
        System.out.println(maximum1s(arr));
        System.out.println(findMaximum1sInTheRow(arr));
    }
}
