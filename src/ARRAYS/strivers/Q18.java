package ARRAYS.strivers;

import java.util.Arrays;

public class Q18 {


    static void setRowZeroes(int[][] arr, int rows) {

        int cols = arr[0].length;

        for (int i = 0; i < cols; i++) {

            arr[rows][i] = 0;
        }


    }


    static void setColsZeroes(int[][] arr, int cols) {

        int rows = arr.length;

        for (int i = 0; i < rows; i++) {

            arr[i][cols] = 0;

        }


    }

    static void setMatrixZeroes(int[][] arr) {

        // brute force which may not work for all cases
        //  Time Complexity (TC): O((rows * cols) × (rows + cols))
        //  Space Complexity (SC): O(1)


        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == 0) {

                    arr[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == -1) {

                    setRowZeroes(arr, i);
                    setColsZeroes(arr, j);

                }

            }

        }

        System.out.println(Arrays.deepToString(arr));

    }


    // optimal solution
    static void setMatrixZeroesI(int[][] matrix) {

        //  Time Complexity (TC): O(rows * cols)
        //  Space Complexity (SC): O(1)


        int rows = matrix.length;
        int cols = matrix[0].length;


        boolean firstRowZeroes = false;
        boolean firstColsZeroes = false;

        // Check if first row contains any zero

        for (int j = 0; j < cols; j++) {

            if (matrix[0][j] == 0) {

                firstRowZeroes = true;
                break;
            }

        }

        // Check if first column contains any zero

        for (int i = 0; i < rows; i++) {

            if (matrix[i][0] == 0) {

                firstColsZeroes = true;
                break;

            }
        }


        // Use first row and column as markers

        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {


                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }

            }
        }


        // Set matrix cells to zero based on markers

        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {

                    matrix[i][j] = 0;
                }

            }


        }

        // Zero out first row if needed

        if (firstRowZeroes) {

            for (int j = 0; j < cols; j++) {

                matrix[0][j] = 0;
            }
        }

        // Zero out first column if needed

        if (firstColsZeroes) {

            for (int i = 0; i < rows; i++) {

                matrix[i][0] = 0;
            }
        }


        System.out.println(Arrays.deepToString(matrix));

    }


    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZeroes(arr);
        int[][] arr1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZeroesI(arr1);

    }
}
