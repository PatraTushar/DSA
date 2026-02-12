package ARRAYS.interviewQuestions;

import java.util.Arrays;

public class Q25 {

    static int[][] spiralMatrixII(int n){

        //Time Complexity (TC): O(n²)
        //Space Complexity (SC): O(n²)

        int[][] result = new int[n][n];

        int rows = result.length;
        int cols = result[0].length;

        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = cols - 1;
        int num = 1;


        while (topRow <= bottomRow && leftCol <= rightCol) {


            for (int i = leftCol; i <= rightCol; i++) {


                result[topRow][i] = num++;

            }

            topRow++;


            for (int i = topRow; i <= bottomRow; i++) {


                result[i][rightCol] = num++;

            }

            rightCol--;


            if (topRow <= bottomRow && leftCol <= rightCol) {

                for (int i = rightCol; i >= leftCol; i--) {


                    result[bottomRow][i] = num++;
                }

                bottomRow--;


            }


            if (topRow <= bottomRow && leftCol <= rightCol) {

                for (int i = bottomRow; i >= topRow; i--) {

                    result[i][leftCol] = num++;

                }

                leftCol++;
            }


        }

        return result;
    }
    public static void main(String[] args) {

        // Q: spiralMatrixII  (leeTCode-->59)

        int n=3;
        int[][] ans=spiralMatrixII(n);
        System.out.println(Arrays.deepToString(ans));




    }
}
