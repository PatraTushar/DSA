package TWODIMENSIONALARRAYS;

import java.util.Scanner;
public class Q1 {

    static void printMatrix(int[][] matrix){
        for(int i=0;i< matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }

            System.out.println();
        }
    }

    static void add(int[][] arr,int r1,int c1,int[][] arr_2,int r2, int c2 ){


        int[][] sum=new int[r1][c1];

        if(r1 != r2 || c1!=c2){

            System.out.println( " wrong input : addition not possible");

        }


         for(int i=0;i<r1;i++){

              for(int j=0;j<c1;j++){

                sum[i][j]=arr[i][j] +arr_2[i][j];
            }
        }

        System.out.println(" sum of matrix 1 and matrix 2 is");
         printMatrix(sum);

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter number of rows and columns of matrix 1");
        int r1=sc.nextInt();
        int c1= sc.nextInt();

        int[][] arr=new int[r1][c1];

        System.out.println(" enter matrix values ");

        for(int i=0;i<r1;i++){

            for(int j=0;j<c1;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter number of rows and columns matrix 2");

        int r2= sc.nextInt();
        int c2=sc.nextInt();

        int[][] arr_2=new int[r2][c2];

        System.out.println(" enter matrix values");

        for(int i=0;i<r2;i++){

            for(int j=0;j<c2;j++){

                arr_2[i][j]=sc.nextInt();


            }
        }


        System.out.println(" matrix 1");
        printMatrix(arr);

        System.out.println(" matrix 2");
        printMatrix(arr_2);

        add(arr,r1,c1,arr_2,r2,c2);



    }
}
