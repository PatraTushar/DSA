package Greedy;

import java.util.Arrays;

public class Q11 {

    static int maxIceCream(int[] costs, int coins) {

        //  Time Complexity: O(n) + ( n log n) = o(n log n)
        //  Space Complexity: O(1)


        int iceCreamCount = 0;

        Arrays.sort(costs);

        for (int cost : costs) {

            if (cost <= coins) {

                iceCreamCount++;
                coins -= cost;
            } else break;

        }

        return iceCreamCount;


    }


    public static void main(String[] args) {

        // leeTCode->1833

        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        System.out.println(maxIceCream(costs,coins));
    }
}
