package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q61 {

    static void printMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    static void addition(int matrix1[][],int r1,int c1,int matrix2[][],int r2,int c2){

        int[][] Addition=new int[r1][c1];

        if(r1!=c1 || r2!=c2 || r1!=r2 || c1!=c2){
            System.out.println(" addition is not possible ");
            return;
        }


        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                Addition[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println(" sum is ");
        printMatrix(Addition);




    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows of matrix 1 ");
        int r1=sc.nextInt();

        System.out.println(" enter columns of matrix 1 ");
        int c1=sc.nextInt();

        int Matrix1[][]=new int[r1][c1];


        System.out.println(" enter elements of Matrix1 ");
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++){
                Matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println(" enter rows of matrix 2 ");
        int r2=sc.nextInt();

        System.out.println(" enter columns of matrix 2 ");
        int c2=sc.nextInt();

        int Matrix2[][]=new int[r2][c2];


        System.out.println(" enter elements of Matrix2 ");
        for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++){
                Matrix2[i][j]=sc.nextInt();
            }
        }

        addition(Matrix1,r1,c1,Matrix2,r2,c2);









    }




    }

