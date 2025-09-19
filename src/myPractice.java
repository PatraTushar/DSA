import java.util.*;

public class myPractice {

    static void setRowZeroes(int[][] arr, int row, int col) {

        for (int i = 0; i < col; i++) {

           if (arr[row][i] !=0) arr[row][i] = -1;
        }


    }


    static void setColsZeroes(int[][] arr, int row, int col) {

        for (int i = 0; i < row; i++) {

           if (arr[i][col]!=0)arr[i][col] = -1;
        }


    }

    static int[][] func(int[][] arr) {

        int rows = arr.length ;
        int cols = arr[0].length ;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == 0) {

                    setRowZeroes(arr, i, cols);
                    setColsZeroes(arr, rows, j);


                }
            }
        }


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == -1) {

                    arr[i][j] = 0;


                }
            }
        }


        return arr;


    }


    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        int[][] ans=func(arr);
        System.out.println(Arrays.deepToString(ans));


    }
}








