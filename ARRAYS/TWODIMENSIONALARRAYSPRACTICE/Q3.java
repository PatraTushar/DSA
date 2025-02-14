package ARRAYS.TWODIMENSIONALARRAYSPRACTICE;

import java.util.Scanner;

public class Q3 {

    static void printMatrix(int Matrix[][]){

        for(int i=0;i< Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int arr[][],int r,int c){

           int[][] ans=new int[c][r];

           for(int i=0;i<c;i++){
               for(int j=0;j<r;j++){
                   ans[i][j]=arr[j][i];
               }
           }

           return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];

        System.out.println("enter elements of the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("input matrix");
        printMatrix(arr);


        System.out.println("transpose of matrix");
        int[][] ans=transpose(arr,r,c);
        printMatrix(ans);

    }
}
