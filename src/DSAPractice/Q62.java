package DSAPractice;

public class Q62 {

    static int findMaxOnesInRows(int[] num, int cols) {

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if ((mid == 0 || num[mid - 1] == 0) && num[mid] == 1) {
                return num.length - mid;

            } else if (num[mid] == 1) high = mid - 1;
            else low = mid + 1;


        }

        return 0;

    }


    static int maximum1s(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int maxOne = 0;
        int idx = 0;

        for (int i = 0; i < rows; i++) {

            int maximum = findMaxOnesInRows(mat[i], cols);

            if (maximum > maxOne) {

                maxOne = maximum;
                idx = i;
            }


        }

        return idx;


    }


    public static void main(String[] args) {

        int[][] arr = {{0, 0, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}};
        System.out.println(maximum1s(arr));

    }
}
