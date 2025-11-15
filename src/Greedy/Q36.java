package Greedy;

import java.util.Arrays;

public class Q36 {

    static int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {

        // solution of leeTCOde->3218

        //  Time Complexity: O( m log m + n log n)
        //  Space Complexity: O(1)

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        int horizontalPiece = 1;
        int verticalPiece = 1;
        int cost = 0;

        int i = horizontalCut.length - 1;
        int j = verticalCut.length - 1;

        while (i >= 0 && j >= 0) {

            if (horizontalCut[i] > verticalCut[j]) {

                horizontalPiece += 1;
                cost += horizontalCut[i] * verticalPiece;
                i--;


            } else {

                verticalPiece += 1;
                cost += verticalCut[j] * horizontalPiece;
                j--;


            }

        }

        while (i >= 0) {

            cost += verticalPiece * horizontalCut[i];
            i--;
        }

        while (j >= 0) {
            cost += horizontalPiece * verticalCut[j];
            j--;
        }

        return cost;


    }



    static long minimumCostI(int m, int n, int[] horizontalCut, int[] verticalCut) {

        // solution of leeTCOde->3219

        //  Time Complexity: O( m log m + n log n)
        //  Space Complexity: O(1)

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        long horizontalPiece = 1;
        long verticalPiece = 1;
        long cost = 0;

        int i = horizontalCut.length - 1;
        int j = verticalCut.length - 1;

        while (i >= 0 && j >= 0) {

            if (horizontalCut[i] > verticalCut[j]) {

                horizontalPiece += 1;
                cost += horizontalCut[i] * verticalPiece;
                i--;


            } else {

                verticalPiece += 1;
                cost += verticalCut[j] * horizontalPiece;
                j--;


            }

        }

        while (i >= 0) {

            cost += verticalPiece * horizontalCut[i];
            i--;
        }

        while (j >= 0) {
            cost += horizontalPiece * verticalCut[j];
            j--;
        }

        return cost;


    }

    public static void main(String[] args) {

        // leeTCode->3218

        int m = 3;
        int n = 2;
        int[] horizontalCut = {1, 3};
        int[] verticalCut = {5};
        System.out.println(minimumCost(m, n, horizontalCut, verticalCut));



        // leeTCode->3219

        System.out.println(minimumCostI(m,n,horizontalCut,verticalCut));







    }
}
