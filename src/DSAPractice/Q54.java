package DSAPractice;

import java.util.Arrays;

public class Q54 {

    static void setMatrixZeroes(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        boolean firstRowZeroes = false;
        boolean firstColZeroes = false;


        for (int j = 0; j < cols; j++) {

            if (arr[0][j] == 0) {

                firstRowZeroes = true;
                break;
            }

        }


        for (int i = 0; i < rows; i++) {

            if (arr[i][0] == 0) {

                firstColZeroes = true;
                break;
            }
        }


        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if (arr[i][j] == 0) {

                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }

            }

        }


        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {


                if (arr[i][0] == 0 || arr[0][j] == 0) {

                    arr[i][j] = 0;
                }
            }
        }

        if (firstRowZeroes) {

            for (int j = 0; j < cols; j++) {

                arr[0][j] = 0;
            }
        }

        if (firstColZeroes) {

            for (int i = 0; i < rows; i++) {

                arr[i][0] = 0;
            }
        }





    }

    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
