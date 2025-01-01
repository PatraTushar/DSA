package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q62 {

    static void printMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }


    static void multiplication(int matrix1[][],int r1,int c1,int matrix2[][],int r2,int c2){


        int multiply[][]=new int[r1][c2];
        if(c1!=r2){
            System.out.println(" multiplication is not possible ");
            return;
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

                for(int k=0;k<c1;k++){
                    multiply[i][j]+=matrix1[i][k]*matrix2[k][j];
                }

            }
        }

        System.out.println(" multiplication is ");
        printMatrix(multiply);






    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows of matrix 1 ");
        int r1=sc.nextInt();

        System.out.println(" enter columns of matrix 1 ");
        int c1=sc.nextInt();

        int matrix1[][]=new int[r1][c1];

        System.out.println(" enter elements of matrix 1 ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }


        System.out.println(" enter rows of matrix 2 ");
        int r2=sc.nextInt();

        System.out.println(" enter columns of matrix 2 ");
        int c2=sc.nextInt();

        int matrix2[][]=new int[r2][c2];

        System.out.println(" enter elements of matrix 2 ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        multiplication(matrix1,r1,c1,matrix2,r2,c2);




    }


    }
