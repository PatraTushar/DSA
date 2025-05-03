package ArraysbyKK.interviewQuestions;

import java.util.Arrays;

public class Q22 {


    static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int[] arr,int start,int end){



        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;

        }
    }



    static int[][] transpose(int[][] arr){

        int r= arr.length;
        int c=arr[0].length;

        int[][] result=new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                result[i][j]=arr[j][i];

            }
        }

        return result;

    }

    static int[][] rotate90deg(int[][] arr){

        //Total Time Complexity (TC):O(r * c)
        //(Where r is the number of rows and c is the number of columns in the 2D array)
        //Total Space Complexity (SC):O(r * c)
        //(For the new 2D array created in the transpose function)

        int[][] transpose=transpose(arr);

        for(int i=0;i<transpose.length;i++){

            reverse(transpose[i],0,transpose[0].length-1);
        }

        return transpose ;
    }
    public static void rotate(int[][] arr) {    // optimal Approach

        //Time Complexity (TC):O(r * c)
        //Where r is the number of rows and c is the number of columns in the matrix. The nested loops for transposing and reversing the rows both iterate over the entire matrix.
        //Space Complexity (SC):O(1)


        int rows=arr.length;
        int cols=arr[0].length;

        for(int i=0;i<rows;i++){

            for(int j=i;j<cols;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }


        for(int i=0;i<rows;i++){

            int start=0;
            int end=cols-1;

            while (start<=end){

                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }




        }


        System.out.println(Arrays.deepToString(arr));

    }

    public static void main(String[] args) {

        // Q: Rotate a square matrix

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{8,5},{11,9},{5,4}};
     //  int[][] ans= rotate90deg(arr);
      //  System.out.println(Arrays.deepToString(ans));
        rotate(arr);
    }
}
