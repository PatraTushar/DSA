package ArraysbyStriver.interviewQuestions;

import java.util.Arrays;

public class Q20 {


    static void multiplication(int[][] arr1,int[][] arr2){

        int  r1=arr1.length;
        int c1=arr1[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;

        int[][] result=new int[r1][c2];

         //Time Complexity (TC): O(r1 * c2 * c1)
        // Space Complexity (SC): O(r1 * c2)

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible: The number of columns in arr1 must equal the number of rows in arr2.");
            return;
        }


        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

              for(int k=0;k<c1;k++){

                  result[i][j]+=arr1[i][k]*arr2[k][j];
              }

            }
        }

        System.out.println(Arrays.deepToString(result));

    }

    public static void main(String[] args) {

        // Q: multiplication of 2 matrix

        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{8,5},{11,9},{5,4}};
        multiplication(arr1,arr2);



    }
}
