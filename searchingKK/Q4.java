package searchingKK;

import java.util.Arrays;

public class Q4 {

    static int[] searchIn2DArray(int arr[][],int target){

        for(int row=0;row<arr.length;row++){

            for(int col=0;col<arr[row].length;col++){

                if(arr[row][col]==target){

                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};


    }

    public static void main(String[] args) {

        int nums[][]= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target=34;

        int ans[]=searchIn2DArray(nums,target);
        System.out.println(Arrays.toString(ans));


        }



    }

