package DSA_PRACTICE.ARRAYS;


import java.util.Scanner;

public class Q64 {

    static void Printmatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }

            System.out.println();
        }
    }

    static void reverse(int arr[]){
        int i=0,j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void transpose(int matrix[][],int rows,int columns){

        for(int i=0;i<rows;i++){
            for(int j=i;j<columns;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    static void rotate(int matrix[][],int rows,int columns){

        //transpose
        transpose(matrix,rows,columns);

        //reverse each row
        for(int i=0;i<rows;i++){
            reverse(matrix[i]);
        }



        System.out.println(" rotated matrix is");
        Printmatrix(matrix);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows of the matrix ");
        int rows=sc.nextInt();

        System.out.println(" enter columns of the matrix ");
        int columns=sc.nextInt();

        int matrix[][]=new int[rows][columns];

        System.out.println(" enter matrix elements ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        rotate(matrix,rows,columns);
    }








    }

