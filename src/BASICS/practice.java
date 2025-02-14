package BASICS;

import java.util.Arrays;

public class practice {

    static int[] search(int arr[][],int target){

        int rows=0;
        int col=arr[rows].length-1;

        while(rows<arr.length && col>=0){

            if(target>arr[rows][col]){
                rows++;
            }

            else if(target<arr[rows][col]){
                col--;
            }

            else{

                return new int[]{rows,col};
            }


        }

        return new int[]{-1,-1};


    }

    public static void main(String[] args) {

        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        int target=7;
        int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));


    }




}
