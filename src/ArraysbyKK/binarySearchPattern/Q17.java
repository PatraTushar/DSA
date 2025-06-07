package ArraysbyKK.binarySearchPattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q17 {

    static int[] findTarget(int[][] arr,int target){

        int rows=0;
        int columns=arr[rows].length-1;

        while (rows<arr.length && columns>=0){

            if(arr[rows][columns]==target){
                return new int[]{rows,columns};
            }

            else if(target<arr[rows][columns]){
                columns--;
            }

            else {
                rows++;
            }
        }

        return new int[]{-1,-1};
    }



    public static void main(String[] args) {

        // search in sorted matrix(matrix is sorted in rowWise and columnWise)

        int[][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=37;
        int[] ans=findTarget(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
