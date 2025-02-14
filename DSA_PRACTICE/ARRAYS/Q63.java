package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q63 {

    static void printMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }


    static void inPlaceTranspose(int matrix[][],int rows,int columns){

        for(int i=0;i<rows;i++){
            for (int j=i;j<columns;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }


    }


    static void transpose(int matrix[][],int rows,int columns){


        int Transpose[][]=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Transpose[i][j]= matrix[j][i];
            }
        }

        System.out.println(" transpose is ");
        printMatrix(Transpose);


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        System.out.println(" enter columns ");
        int columns=sc.nextInt();

        int matrix[][]=new int[rows][columns];

        System.out.println(" enter matrix element ");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }

    }

       // transpose(matrix,rows,columns);
        inPlaceTranspose(matrix,rows,columns);
        printMatrix(matrix);






    }
}
