package Greedy;

public class Q16 {

    static int minTaps(int n, int[] ranges) {

        int[] maxReach = new int[n + 1];

        // Step 1: Build maxReach array
        for (int i = 0; i <= n; i++) {

            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);

            maxReach[left] = Math.max(maxReach[left], right);
        }

        // Step 2: Greedy sweep
        int openTaps = 0;
        int currEnd = 0;
        int nextEnd = 0;

        for (int i = 0; i <= n; i++) {

            if (i > nextEnd) return -1;  // cannot reach this point

            nextEnd = Math.max(nextEnd, maxReach[i]);

            if (i == currEnd) {

                if (currEnd != nextEnd) {
                    openTaps++;
                    currEnd = nextEnd;
                }
            }
        }

        return openTaps;
    }

    public static void main(String[] args) {

        // leeTCode->1326


    }
}
