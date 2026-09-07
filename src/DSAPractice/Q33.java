package DSAPractice;

import java.util.Arrays;

public class Q33 {

    static int[] findTarget(int[][] arr, int target) {

        int n = arr.length;

        int rows = 0;
        int cols = arr[0].length - 1;


        while (rows < arr.length && cols >= 0) {

            if (arr[rows][cols] == target) return new int[]{rows, cols};

            else if (arr[rows][cols] > target) cols--;
            else rows++;
        }

        return new int[]{-1, -1};


    }

    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target = 37;
        int[] ans = findTarget(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
