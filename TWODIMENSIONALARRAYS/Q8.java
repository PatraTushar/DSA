package TWODIMENSIONALARRAYS;

import java.util.Scanner;

public class Q8 {

    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }


    static int findSum(int arr[][],int l1,int r1,int l2,int r2){

        int sum=0;

        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){

                sum+=arr[i][j];

            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows and columns of the matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];

        System.out.println("enter " + r * c + " elements ");
        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                arr[i][j]=sc.nextInt();
            }

        }

        System.out.println(" enter rectangle boundaries l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println(" Rectangle sum " +findSum(arr,l1,r1,l2,r2));





    }
}
