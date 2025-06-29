package ArraysbyStriver.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q24 {

    static List<Integer> spiralOrder(int[][] matrix){

        //Time Complexity (TC): O(n × m)
        //Space Complexity (SC): O(n × m) — for the output list (excluding input matrix)


       List<Integer> list=new ArrayList<>();

        int topRow=0;
        int bottomRow=matrix.length-1;
        int leftColumn=0;
        int rightColumn=matrix[0].length-1;


        while (topRow<=bottomRow && leftColumn<=rightColumn){

            // 1. Traverse Top Row (→)

            for (int i=leftColumn;i<=rightColumn;i++){
                list.add(matrix[topRow][i]);
            }

            topRow++;

            //2. Traverse Right Column (↓)

            for(int i=topRow;i<=bottomRow;i++){
                list.add(matrix[i][rightColumn]);
            }
            rightColumn--;


            //  3. Traverse Bottom Row (←) [check needed]

            if(topRow<=bottomRow && leftColumn<=rightColumn) {


                for (int i = rightColumn; i >= leftColumn; i--) {
                    list.add(matrix[bottomRow][i]);

                }
                bottomRow--;

            }

          // 4. Traverse Left Column (↑) [check needed]

            if( topRow<=bottomRow && leftColumn<=rightColumn ) {

                for (int i = bottomRow; i >= topRow; i--) {
                    list.add(matrix[i][leftColumn]);
                }
                leftColumn++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        // Q: Given a n*m matrix A .return all elements of matrix  in spiral order  (leeTCode-->54)

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans=spiralOrder(arr);
        System.out.println(ans);
    }
}
