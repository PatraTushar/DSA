import java.util.Arrays;

public class myPractice {

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


    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZeroes(arr);


    }
}

