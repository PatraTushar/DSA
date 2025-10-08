import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {

    static int[][] spiralOrder(int n) {


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


        int[][] ans = spiralOrder(3);
        System.out.println(Arrays.deepToString(ans));


    }
}







