package DSAPractice;

import java.util.Arrays;

public class Q41 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] moveZeroes(int[] arr) {

        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) arr[index++] = arr[i];
        }

        while (index < n) {
            arr[index++] = 0;
        }


        return arr;
    }

    public static void main(String[] args) {


        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] Ans = moveZeroes(arr);
        System.out.println(Arrays.toString(Ans));
    }
}
