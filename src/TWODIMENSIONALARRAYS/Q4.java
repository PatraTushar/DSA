package TWODIMENSIONALARRAYS;

import java.util.Scanner;

public class Q4 {

    static void Printmatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }

            System.out.println();
        }
    }

    static void transpose(int arr[][],int r,int c){

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;



            }
        }
    }

    static void reverseArray(int arr[]){

        int i=0,j=arr.length-1;

        while(i<j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }




    }

    static void rotate(int arr[][],int n){

        //transpose
        //reverse each row of transpose matrix

        transpose(arr,n,n);
        for(int i=0;i<n;i++){

            reverseArray(arr[i]);

        }




    }







    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];


        System.out.println("enter elements of the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("input matrix");
        Printmatrix(arr);

        rotate(arr,r);

        System.out.println("rotation of matrix");
        Printmatrix(arr);















    }
}




