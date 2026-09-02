package DSAPractice;

import java.util.ArrayList;
import java.util.List;

public class Q16 {

    static List<Integer> spiral(int[][] arr) {

        int topRow = 0;
        int bottomRow = arr.length - 1;
        int leftCol = 0;
        int rightCol = arr[0].length - 1;

        List<Integer> res = new ArrayList<>();

        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int i = leftCol; i <= rightCol; i++) {

                res.add(arr[topRow][i]);
            }

            topRow++;


            for (int i = topRow; i <= bottomRow; i++) {

                res.add(arr[i][rightCol]);
            }

            rightCol--;

            if (topRow <= bottomRow && leftCol <= rightCol){


                for (int i = rightCol; i >= leftCol; i--) {
                    res.add(arr[bottomRow][i]);
                }
                bottomRow--;


                for (int i = bottomRow; i >= topRow; i--) {

                    res.add(arr[i][leftCol]);
                }

                leftCol++;


            }



        }

        return res;


    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans = spiral(arr);
        System.out.println(ans);

    }
}
