import OopsByKK.AccessModifier.Public.A;
import OopsByKK.AccessModifier.Public.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {

    static void swap(int[][] arr, int i, int j) {

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }


    static int[][] func(int n) {


        int[][] result = new int[n][n];

        int TopRow = 0;
        int BottomRow = n - 1;
        int LeftCol = 0;
        int RightCol = n - 1;
        int num=1;


        while (TopRow <= BottomRow && LeftCol <= RightCol) {



            for (int i = LeftCol; i <= RightCol; i++) {

              result[TopRow][i]=num++;

            }

            TopRow++;


            for (int i = TopRow; i <= BottomRow; i++) {

                result[i][RightCol]=num++;

            }

            RightCol--;

            if (TopRow <= BottomRow && LeftCol <= RightCol) {

                for (int i = RightCol; i >= LeftCol; i--) {

                    result[BottomRow][i]=num++;
                }

                BottomRow--;


            }


            if (TopRow <= BottomRow && LeftCol <= RightCol) {

                for (int i = BottomRow; i >= TopRow; i--) {

                    result[i][LeftCol]=num++;
                }

                LeftCol++;

            }


        }

        return result;


    }


    public static void main(String[] args) {


        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  // square matrix


        int[][] ans = func(3);
        System.out.println(Arrays.deepToString(ans));


    }

}











