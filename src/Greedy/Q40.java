package Greedy;

public class Q40 {

    static int find(int[] tops, int[] bottoms, int val) {



        int n = tops.length;
        int topSwaps = 0;
        int bottomSwaps = 0;

        for (int i = 0; i < n; i++) {

            if (tops[i] != val && bottoms[i] != val) return -1;

            else if (tops[i] != val) topSwaps++;

            else if (bottoms[i] != val) bottomSwaps++;
        }


        return Math.min(topSwaps, bottomSwaps);

    }


    static int minDominoRotations(int[] tops, int[] bottoms) {

        //  Time Complexity: O(6) * O(n) = O(n)
        //  Space Complexity: O(1)



        int result = Integer.MAX_VALUE;

        for (int val = 1; val <= 6; val++) {

            int steps = find(tops, bottoms, val);

            if (steps != -1) result = Math.min(result, steps);


        }

        return result == Integer.MAX_VALUE ? -1 : result;


    }

    public static void main(String[] args) {

        // leeTCode->1007

        int[] tops = {2, 1, 2, 4, 2, 2};
        int[] bottoms = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(tops, bottoms));
    }
}
