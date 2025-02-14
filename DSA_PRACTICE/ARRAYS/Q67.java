package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q67 {

    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }


    static int[][] generateSpiralMatrix(int rows){

        int spiral[][]=new int[rows][rows];

        int totalElements=rows*rows;
        int count=1;
        int topRow=0,bottomRow=rows-1,leftColumn=0,rightColumn=rows-1;

        while(count<=totalElements){

            //topRow-->leftColumn to rightColumn

            for(int j=leftColumn;j<=rightColumn && count<=totalElements ;j++){
                spiral[topRow][j]=count;
                count++;
            }
            topRow++;

            //rightColumn-->topRow to bottomRow

            for(int i=topRow;i<=bottomRow && count<=totalElements;i++){

                spiral[i][rightColumn]=count;
                count++;
            }

            rightColumn--;

            //bottomRow-->rightColumn to leftColumn

            for(int i=rightColumn;i>=leftColumn && count<=totalElements;i--){

                spiral[bottomRow][i]=count;
                count++;

            }

            bottomRow--;

            //leftColumn-->bottomRow to topRow

            for(int i=bottomRow;i>=topRow && count<=totalElements;i--){
                spiral[i][leftColumn]=count;
                        count++;

            }

            leftColumn++;
        }

        return spiral;

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows= sc.nextInt();

        int ans[][]=generateSpiralMatrix(rows);
        printMatrix(ans);



    }
}
