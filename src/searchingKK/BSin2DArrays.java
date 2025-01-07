package searchingKK;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BSin2DArrays {

    //  matrix is sorted in row wise and column wise

    static int[] search(int[][] matrix,int target){

        int row=0;
        int column=matrix.length-1;

        while(row<matrix.length && column>=0){

            if(matrix[row][column]==target){
                return new int[]{row,column};
            }

            if( matrix[row][column]<target){
                row++;
            }

            else if(matrix[row][column]>target){
                column--;
            }


        }

        return new int[]{-1,-1};


    }

    public static void main(String[] args) {

        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}};

        int target=37;

        System.out.println(Arrays.toString(search(matrix,target)));






    }
}
