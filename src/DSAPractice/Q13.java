package DSAPractice;

import java.util.Arrays;

public class Q13 {

    static void swap(int[][] arr, int p, int q) {


        int temp = arr[p][q];
        arr[p][q] = arr[q][p];
        arr[q][p] = temp;


    }


    static int[][] add(int[][] arr1, int[][] arr2) {

        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] res = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                res[i][j] = arr1[i][j] + arr2[i][j];
            }


        }

        return res;

    }


    static void multiplication(int[][] arr3, int[][] arr4) {

        int rows1 = arr3.length;
        int cols1 = arr3[0].length;
        int rows2 = arr4.length;
        int cols2 = arr4[0].length;
        int[][] res = new int[rows1][cols2];

        if (cols1 == rows2) {

            for (int rows = 0; rows < rows1; rows++) {

                for (int cols = 0; cols < cols2; cols++) {

                    for (int i = 0; i < rows2; i++) {

                        res[rows][cols] += arr3[rows][i] * arr4[i][cols];
                    }
                }

            }

            System.out.println(Arrays.deepToString(res));


        } else System.out.println(" multiplication is nit possible ");


    }


    static void transpose(int[][] num) {

        int rows = num.length;
        int cols = num[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = i + 1; j < cols; j++) {

                swap(num, i, j);
            }
        }

        System.out.println(Arrays.deepToString(num));

    }

    static int[][] transposeI(int[][] num) {

        int rows = num.length;
        int cols = num[0].length;

        int[][] res = new int[cols][rows];

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {

                res[i][j]=num[j][i];

            }
        }
        return res;
    }


    public static void main(String[] args) {


        int[][] arr1 = {{2, 3}, {4, 5}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        int[][] Add = add(arr1, arr2);
        System.out.println(Arrays.deepToString(Add));


        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr4 = {{8, 5}, {11, 9}, {5, 4}};
        multiplication(arr3, arr4);


        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  // square matrix
        int[][] num = {{1, 2, 3}, {4, 5, 6}};         // Non square matrix
        transpose(arr);
        int[][] res=transposeI(num);
        System.out.println(Arrays.deepToString(res));


    }
}
