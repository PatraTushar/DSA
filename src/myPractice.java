import java.util.Arrays;

public class myPractice {

    static int[] findTarget(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0) {

            if (arr[i][j] == target) return new int[]{i, j};

            else if (arr[i][j] < target) i++;

            else j--;

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







