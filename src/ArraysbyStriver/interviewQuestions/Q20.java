package ArraysbyStriver.interviewQuestions;

import java.util.Arrays;

public class Q20 {


    static void multiplication(int[][] arr1,int[][] arr2){

        //Time Complexity (TC): O(row1 * cols2 * cols1)
        //Space Complexity (SC): O(rows1 * cols2 )

        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int rows2 = arr2.length;
        int cols2 = arr2[0].length;

        int[][] multiplication = new int[rows1][cols2];

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible: The number of columns in arr1 must equal the number of rows in arr2.");
            return;
        }


        for (int i = 0; i < rows1; i++) {

            for (int j = 0; j < cols2; j++) {

                for (int k = 0; k < cols1; k++) {

                    multiplication[i][j] += arr1[i][k] * arr2[k][j];
                }


            }
        }

        System.out.println(Arrays.deepToString(multiplication));

    }

    public static void main(String[] args) {

        // Q: multiplication of 2 matrix

        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{8,5},{11,9},{5,4}};
        multiplication(arr1,arr2);



    }
}
