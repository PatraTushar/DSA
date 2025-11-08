package Greedy;

public class Q12 {

    static int canCompleteCircle(int[] gas, int[] cost) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = gas.length;

        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {

            totalGas += gas[i];
            totalCost += cost[i];


        }

        if (totalCost > totalGas) return -1;

        int start = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {

            total += gas[i] - cost[i];

            if (total < 0) {

                total = 0;
                start = i + 1;
            }
        }

        return start;


    }

    public static void main(String[] args) {

        // leeTCode->134

        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircle(gas,cost));

    }
}
