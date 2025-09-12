package ArraysbyStriver.interviewQuestions;

import java.util.Arrays;

public class Q25 {

    static int[][] spiralMatrixII(int n){

        //Time Complexity (TC): O(n²)
        //Space Complexity (SC): O(n²)

        int[][] newMatrix=new int[n][n];

        int number=1;
        int topRow=0;
        int bottomRow=n-1;
        int leftColumn=0;
        int rightColumn=n-1;

        while(topRow<=bottomRow && leftColumn<=rightColumn){

            for(int i=leftColumn;i<=rightColumn;i++){

                newMatrix[topRow][i]=number++;
            }

            topRow++;

            for(int i=topRow;i<=bottomRow;i++){

                newMatrix[i][rightColumn]=number++;
            }

            rightColumn--;

            if(topRow<=bottomRow && leftColumn<=rightColumn){

                for(int i=rightColumn;i>=leftColumn;i--){

                    newMatrix[bottomRow][i]=number++;

                }

                bottomRow--;
            }


            if(topRow<=bottomRow && leftColumn<=rightColumn){

                for(int i=bottomRow;i>=topRow;i--){

                    newMatrix[i][leftColumn]=number++;

                }

                leftColumn++;
            }

        }

        return newMatrix;

    }
    public static void main(String[] args) {

        // Q: spiralMatrixII  (leeTCode-->59)

        int n=3;
        int[][] ans=spiralMatrixII(n);
        System.out.println(Arrays.deepToString(ans));




    }
}
