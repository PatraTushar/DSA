package TWODIMENSIONALARRAYS;

import java.util.Scanner;

public class Q3 {

    static void printMatrix(int matrix[][]){

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int a[][],int r,int c){

        int[][] ans=new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=a[j][i];
            }
        }
        return ans;


    }


    static void transposeinPlace(int[][] a,int r,int c){

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }


    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];

        System.out.println("enter elements in the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("input matrix");
        printMatrix(a);

        System.out.println("Transpose of a matrix");
        int[][] ans=transpose(a,r,c);
        printMatrix(ans);
//        transposeinPlace(a,r,c);
//        printMatrix(a);


    }
}
