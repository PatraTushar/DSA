package ArraysbyKK.interviewQuestions;

import java.util.Arrays;

public class Q21 {

    static void swap(int[][] arr, int i, int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }



    static void transPose(int[][] arr){         // only for square matrix

        int rows=arr.length;
        int cols=arr[0].length;

        for(int i=0;i<rows;i++){
            for (int j=i+1;j<cols;j++){

                swap(arr,i,j);


            }
        }

        System.out.println(Arrays.deepToString(arr));


    }

    static int[][] transpose2(int[][] arr){    // for All matrix type

        int row=arr.length;
        int cols=arr[0].length;

        int Transpose[][]=new int[cols][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                Transpose[j][i]=arr[i][j];
            }
        }

        return Transpose;
    }

    public static void main(String[] args) {

        // Q: Transpose of a matrix

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};  // square matrix
        int[][] num={{1,2,3},{4,5,6}};         // Non square matrix

      //  transPose(arr);

        int[][] Ans=transpose2(num);
        System.out.println(Arrays.deepToString(Ans));


    }
}
