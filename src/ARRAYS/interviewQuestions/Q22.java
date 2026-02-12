package ARRAYS.interviewQuestions;

import java.util.Arrays;

public class Q22 {



    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void reverse(int[] arr, int i, int j) {

        while (i < j) {

            swap(arr, i, j);
            i++;
            j--;
        }
    }





    static int[][] rotate90(int[][] arr) {

        //Time Complexity (TC): O(n × m)
        //Space Complexity (SC): O(1)

        int rows = arr.length;
        int cols = arr[0].length;

        // find transpose

        for (int i = 0; i < rows; i++) {

            for (int j = i + 1; j < cols; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;


            }


        }


        // reverse each row

        for (int i = 0; i < rows; i++) {

            reverse(arr[i], 0, cols - 1);

        }

        return arr;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = rotate90(arr);
        System.out.println(Arrays.deepToString(ans));


    }
}
