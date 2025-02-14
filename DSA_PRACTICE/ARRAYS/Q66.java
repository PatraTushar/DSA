package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q66 {

    static void Printmatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }

            System.out.println();
        }
    }


    static void spiralOrder(int arr[][],int rows,int columns) {

        int topRow = 0;
        int bottomRow = rows - 1;
        int leftColumn = 0;
        int rightColumn = columns - 1;

        int totalElements = 0;

        while (totalElements < rows * columns) {
            //topRow-->leftColumn to rightColumn

            for (int j = leftColumn; j <= rightColumn; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;


            //rightColumn-->topRow to bottomRow

            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(arr[i][rightColumn] + " ");
                totalElements++;
            }
            rightColumn--;

            //bottomRow-->rightColumn to leftColumn

            for (int j = rightColumn; j >= leftColumn; j--) {
                System.out.print(arr[bottomRow][j] +" ");
                totalElements++;
            }

            bottomRow--;


            //leftColumn=bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(arr[i][leftColumn] +" ");
                totalElements++;
            }

            leftColumn++;


        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter number of rows ");
        int rows=sc.nextInt();

        System.out.println(" enter columns ");
        int columns=sc.nextInt();

        int matrix[][]=new int[rows][columns];

        System.out.println(" enter elements of the matrix ");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println(" print matrix ");
        Printmatrix(matrix);

        System.out.println("spiral order ");
        spiralOrder(matrix,rows,columns);





    }
}
