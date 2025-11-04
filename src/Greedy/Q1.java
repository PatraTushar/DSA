package Greedy;

import java.util.Arrays;

public class Q1 {

    static int bagOfTokensScore(int[] tokens, int power) {

        //  Time Complexity: O(n log n)  O(n)
        //  Space Complexity: O(1)


        Arrays.sort(tokens);

        int n = tokens.length;
        int maxScore = 0;
        int score = 0;


        int i = 0;
        int j = n - 1;

        while (i <= j) {

            if (power >= tokens[i]) {

                power -= tokens[i];
                score += 1;
                i++;


            } else if (score >= 1) {

                score -= 1;
                power += tokens[j];
                j--;

            } else break;

            maxScore = Math.max(maxScore, score);

        }

        return maxScore;


    }

    public static void main(String[] args) {

        // leeTCode->948

        int[] tokens = {100, 200, 300, 400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));

    }
}
