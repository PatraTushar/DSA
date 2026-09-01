package DSAPractice;

import java.util.Arrays;

public class Q14 {


    static void swap1D(int[] arr, int p, int q) {


        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;


    }

    static void reverse(int[] arr, int i, int j) {


        while (i < j) {
            swap1D(arr, i, j);
            i++;
            j--;
        }
    }


    static void swap2D(int[][] arr, int p, int q) {


        int temp = arr[p][q];
        arr[p][q] = arr[q][p];
        arr[q][p] = temp;


    }

    static void transpose(int[][] num) {

        int rows = num.length;
        int cols = num[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = i + 1; j < cols; j++) {

                swap2D(num, i, j);
            }
        }


    }


    static int[][] rotate90(int[][] num) {

        int rows = num.length;
        int cols = num[0].length;

        transpose(num);

        for (int i = 0; i < rows; i++) {

            reverse(num[i], 0, cols - 1);
        }

        return num;


    }


    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = rotate90(arr);
        System.out.println(Arrays.deepToString(ans));

    }
}
