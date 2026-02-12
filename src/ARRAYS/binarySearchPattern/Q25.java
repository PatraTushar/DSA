package ARRAYS.binarySearchPattern;


import java.util.Arrays;

public class Q25 {

    static int totalCows(int[] stalls, int mid) {

        int cowPlaced = 1;
        int position = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - position >= mid) {

                cowPlaced++;
                position = stalls[i];
            }


        }

        return cowPlaced;


    }


    static int AggressiveCows(int[] stalls, int cows) {

        // Time Complexity: O(n.log(n)+n⋅log(max(stalls)-1))
        // Space Complexity: O(1)

        Arrays.sort(stalls);

        if (cows > stalls.length) return -1;

        int n = stalls.length;

        int start = 1;
        int end = stalls[n - 1] - stalls[0];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int placesCow = totalCows(stalls, mid);

            if (placesCow >= cows) {

                start = mid + 1;
            } else end = mid - 1;


        }

        return end;


    }

    public static void main(String[] args) {

        // Aggressive cows

        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        System.out.println(AggressiveCows(arr, cows));


    }
}
