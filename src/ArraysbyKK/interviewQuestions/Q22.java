package ArraysbyKK.interviewQuestions;

import java.util.Arrays;

public class Q22 {



    static void reverse(int[] arr){

        int i=0;
        int j=arr.length-1;

        while (i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;

        }
    }

    static void swap(int[][] arr, int i, int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }


    static void rotate90Degree(int[][] arr){  // Brute force approach

        int rows=arr.length;
        int cols=arr[0].length;

        // Step 1: Transpose the matrix

        for(int i=0;i<rows;i++){
            for (int j=i+1;j<cols;j++){
                swap(arr,i,j);

            }

        }

        // Step 2: Reverse each row


       for(int i=0;i<rows;i++){

               reverse(arr[i]);



       }


        System.out.println(Arrays.deepToString(arr));


    }

    public static void rotate(int[][] matrix) {    // optimal Approach


       // transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        // each row reverse

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }

    public static void main(String[] args) {

        // Q: Rotate a square matrix

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
       // rotate90Degree(arr);
        rotate(arr);
    }
}
