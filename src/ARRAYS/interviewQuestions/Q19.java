package ARRAYS.interviewQuestions;

import java.util.Arrays;

public class Q19 {

    static int[][] add(int[][] arr1,int[][] arr2){

        //Time Complexity (TC): O(n × m)
        //Space Complexity (SC): O(n × m)

        int rows=arr1.length;
        int cols=arr1[0].length;

        int[][] addition=new int[rows][cols];


        for (int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                addition[i][j]=arr1[i][j] +arr2[i][j] ;
            }
        }
        return addition;
    }
    public static void main(String[] args) {

        // Q: Addition of 2 matrix

        int[][] arr1={{2,3},{4,5}};
        int[][] arr2={{1,2},{3,4}};
        int[][] Add=add(arr1,arr2);
        System.out.println(Arrays.deepToString(Add));

    }
}
