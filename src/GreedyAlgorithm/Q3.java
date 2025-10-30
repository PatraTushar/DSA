package GreedyAlgorithm;

import java.util.Arrays;

public class Q3 {

    static int SJF(int[] arr) {

        //  Time Complexity:  O(n log n)
        //  Space Complexity: O(1)

        int n = arr.length;

        Arrays.sort(arr);

        int time = 0;
        int waitingTime = 0;


        for (int i = 0; i < n; i++) {

            waitingTime += time;
            time += arr[i];

        }

        return waitingTime / n;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 1, 2};
        System.out.println(SJF(arr));
    }
}
