package DSAPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q17 {

    static int[][] spiralMatrixII(int n) {

        int num = 1;

        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;

        int[][] res = new int[n][n];

        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int i = leftCol; i <= rightCol; i++) {

                res[topRow][i] = num++;
            }

            topRow++;


            for (int i = topRow; i <= bottomRow; i++) {

                res[i][rightCol] = num++;
            }

            rightCol--;

            if (topRow <= bottomRow && leftCol <= rightCol) {


                for (int i = rightCol; i >= leftCol; i--) {

                    res[bottomRow][i] = num++;
                }
                bottomRow--;


                for (int i = bottomRow; i >= topRow; i--) {

                    res[i][leftCol] = num++;
                }

                leftCol++;


            }


        }

        return res;

    }


    public static void main(String[] args) {

        int n = 3;
        int[][] ans = spiralMatrixII(n);
        System.out.println(Arrays.deepToString(ans));
    }
}
