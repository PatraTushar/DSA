package Greedy;

import java.util.Arrays;

public class Q18 {

    static int candy(int[] ratings) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(n)


        int n = ratings.length;

        int[] leftToRight = new int[n];
        int[] rightToLeft = new int[n];

        Arrays.fill(leftToRight, 1);
        Arrays.fill(rightToLeft, 1);

        for (int i = 1; i < n; i++) {

            if (ratings[i] > ratings[i - 1]) leftToRight[i] = leftToRight[i - 1] + 1;
        }

        for (int i = n - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) rightToLeft[i] = rightToLeft[i + 1] + 1;
        }


        int totalCandies = 0;

        for (int i = 0; i < n; i++) {

            totalCandies += Math.max(leftToRight[i], rightToLeft[i]);
        }

        return totalCandies;
    }

    static int candyI(int[] ratings) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        int n = ratings.length;

        int sum = 1;
        int i = 1;

        while (i < n) {

            if (ratings[i] == ratings[i - 1]) {

                sum += 1;
                i++;
                continue;
            }

            int peak = 1;

            while (i < n && ratings[i] > ratings[i - 1]) {

                peak++;
                sum += peak;
                i++;

            }

            int down = 1;

            while (i < n && ratings[i] < ratings[i - 1]) {

                sum += down;
                i++;
                down++;
            }

            if (down > peak) {

                sum += down - peak;
            }


        }

        return sum;


    }

    public static void main(String[] args) {

        // leeTCode->135

        int[] ratings = {1, 2, 10, 10, 10, 2, 1};
        System.out.println(candy(ratings));
        System.out.println(candyI(ratings));

    }
}
