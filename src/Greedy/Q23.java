package Greedy;

import java.util.Arrays;

public class Q23 {

    static int maxCoins(int[] piles) {

        //  Time Complexity: O(n log n)
        //  Space Complexity: O(1)

        int n = piles.length;

        Arrays.sort(piles);

        int bob = 0;
        int alice = n - 1;
        int me = n - 2;
        int coins = 0;

        while (bob <= me && me <= alice) {

            coins += piles[me];
            bob++;
            alice = me - 1;
            me = alice - 1;


        }

        return coins;


    }

    public static void main(String[] args) {

        // leeTCode->1561

        int[] piles = {2, 4, 1, 2, 7, 8};
        System.out.println(maxCoins(piles));


    }
}
