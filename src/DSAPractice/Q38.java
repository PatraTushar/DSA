package DSAPractice;

import java.util.Arrays;

public class Q38 {

    static int findPlacedCow(int[] stalls, int target) {

        int n = stalls.length;
        int cows = 1;
        int distance = stalls[0];

        for (int i = 1; i < n; i++) {

            if (stalls[i] - distance >= target) {

                cows++;
                distance = stalls[i];
            }

        }

        return cows;

    }

    static int AggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int n = stalls.length;

        int low = 1;
        int high = stalls[n - 1];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int cowPlaced = findPlacedCow(stalls, mid);

            if (cowPlaced >= cows) low = mid + 1;
            else high = mid - 1;


        }

        return high;

    }

    public static void main(String[] args) {

        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        System.out.println(AggressiveCows(arr, cows));

    }
}
