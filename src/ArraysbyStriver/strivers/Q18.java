package ArraysbyStriver.strivers;

import java.util.Arrays;

public class Q18 {


    static void setRowZero(int arr[][],int rows){

        for(int i=0;i<arr[0].length;i++){  //column

            if(arr[rows][i]!=0){
                arr[rows][i]=-1;
            }
        }
    }

    static void setColumnZero(int[][] arr,int columns){

        for(int i=0;i<arr.length;i++){  // row

            if(arr[i][columns]!=0){
                arr[i][columns]=-1;
            }



        }
    }

    static int[][] setMatrixZeroes(int[][] arr){

        // brute force which may not work for all cases
        //  Time Complexity (TC): O((n × m) × (n + m))
        //  Space Complexity (SC): O(1)

        int rows=arr.length;
        int columns=arr[0].length;

        for(int i=0;i<rows;i++){

            for(int j=0;j<columns;j++){

                if(arr[i][j]==0){

                    setRowZero(arr,i);
                    setColumnZero(arr,j);
                }
            }
        }


        for(int i=0;i< rows;i++){
            for(int j=0;j<columns;j++){

                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        return arr;
    }

    static void setMatrixZeroesI(int[][] arr){  // better solution

       // Time Complexity: O(m × n)
      //  Space Complexity: O(m + n)




        int[] rows=new int[arr.length];
        int[] columns=new int[arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==0){
                    rows[i]=1;
                    columns[j]=1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){

            for(int j=0;j< arr[0].length;j++){

                if(rows[i]==1 || columns[j]==1){
                    arr[i][j]=0;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

    static void setMatrixZeroesII(int[][] matrix){   // optimal solution

       // Time Complexity: O(m × n)
        //Space Complexity: O(1)

        int rows=matrix.length;
        int cols=matrix[0].length;

      int firstRowZero=1;
      int firstColumnZero=1;

        // Step 1: Check if first row has any zeros
        for(int j=0;j<cols;j++){

            if(matrix[0][j]==0){
                firstRowZero=0;
                break;
            }
        }

        // Step 2: Check if first column has any zeros

        for(int i=0;i<rows;i++){

            if(matrix[i][0]==0){
                firstColumnZero=0;
                break;
            }
        }


        // Step 3: Use first row and column to mark zeros (start from 1)

        for(int i=1;i<rows;i++){

            for(int j=1;j<cols;j++){

                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }


        // Step 4: Set elements to 0 based on marks (start from 1)
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){

                if(matrix[i][0]==0 || matrix[0][j]==0){

                    matrix[i][j]=0;


                }
            }
        }

        // Step 5: Zero out first row if needed
        if(firstRowZero==0){
            for (int j=0;j<cols;j++){
                matrix[0][j]=0;
            }
        }

        // Step 6: Zero out first column if needed

        if(firstColumnZero==0){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));








        }






    public static void main(String[] args) {

        int[][] arr={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

//        int[][] ans=setMatrixZeroes(arr);
//        System.out.println(Arrays.deepToString(ans));
//        setMatrixZeroesI(arr);
        setMatrixZeroesII(arr);



    }
}
