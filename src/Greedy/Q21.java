package Greedy;

import java.util.Arrays;

public class Q21 {

    static int eliminateMaximum(int[] dist, int[] speed) {

        //  Time Complexity: O(n log n)
        //  Space Complexity: O(n)


        int n = dist.length;
        double[] time = new double[n];

        for (int i = 0; i < n; i++) {

            time[i] = (double) dist[i] / speed[i];
        }

        Arrays.sort(time);

        int monsterKilled = 1;

        for (int minute = 1; minute < n; minute++) {

            if (time[minute] <= minute) break;

            monsterKilled++;
        }

        return monsterKilled;

    }

    public static void main(String[] args) {

        // leeTCode->1793


        int[] dist = {1, 3, 4};
        int[] speed = {1, 1, 1};
        System.out.println(eliminateMaximum(dist, speed));
    }
}
