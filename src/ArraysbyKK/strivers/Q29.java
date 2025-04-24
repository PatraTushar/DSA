package ArraysbyKK.strivers;

import java.util.Arrays;

public class Q29 {

    static int findMaxInWhichRow(int[][] arr,int rows,int cols){

        int max=Integer.MIN_VALUE;
        int row=-1;

        for(int i=0;i<rows;i++){

            if(arr[i][cols]>max){
                max=arr[i][cols];
                row=i;

            }
        }

        return row;


    }
    static int[] peakElementII(int[][] arr){
        //Time Complexity (TC): O(rows * log(cols))
        //Space Complexity (SC): O(1)

        int rows=arr.length;
        int cols=arr[0].length;
        int low=0;
        int high=cols-1;

        while (low<=high){

            int mid=low+(high-low)/2;

            int rowHasMax=findMaxInWhichRow(arr,rows,mid);

            // Check if the current element is a peak element

            if((mid==0 || arr[rowHasMax][mid]>arr[rowHasMax][mid-1]) && (mid==cols-1 || arr[rowHasMax][mid]>arr[rowHasMax][mid+1])){

                return new int[]{rowHasMax,mid};

            }

            // If the left neighbor is greater, move to the left half of the columns

            else if( mid>0 && arr[rowHasMax][mid-1]>arr[rowHasMax][mid]){
                high=mid-1;
            }

            // If the right neighbor is greater, move to the right half of the columns

            else {
                low=mid+1;
            }





        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        // peak element II

        int[][] arr={{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
        int[] ans=peakElementII(arr);
        System.out.println(Arrays.toString(ans));


    }
}
