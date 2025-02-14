package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;


public class Q65 {

    static void Printmatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }

            System.out.println();
        }
    }

    static int[][] pascalTriangle(int rows){

        int[][] pascal=new int[rows][];

        for(int i=0;i<rows;i++){



            pascal[i]=new int[i+1];
            pascal[i][0]=pascal[i][i]=1;

            for(int j=1;j<i;j++){

                pascal[i][j]=pascal[i-1][j] + pascal[i-1][j-1];

            }







        }

        return pascal;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

       int ans[][]= pascalTriangle(rows);
       Printmatrix(ans);







    }
}
