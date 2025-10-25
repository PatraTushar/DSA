package ArraysbyStriver.strivers;

public class Q37 {

    static int canCompleteCircle(int[] gas, int[] cost) {

        // Time Complexity (TC): O(n²)
        // Space Complexity (SC): O(1)

        int n = gas.length;
        int gasAvailable;
        int gasNeeded;
        int gasRemaining;


        for (int i = 0; i < n; i++) {

            gasAvailable = gas[i];
            gasNeeded = cost[i];

            if (gasAvailable < gasNeeded) continue;

            gasRemaining = gasAvailable - gasNeeded;


            int j = (i + 1) % n;


            while (j != i) {


                gasRemaining += gas[j];
                gasNeeded = cost[j];

                if (gasRemaining < gasNeeded) break;

                gasRemaining -= gasNeeded;

                j = (j + 1) % n;


            }

            if (j == i) return i;


        }


        return -1;


    }

    static int canCompleteCircleI(int[] gas, int[] cost) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(1)


        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {

            totalGas += gas[i];
            totalCost += cost[i];

        }


        if (totalGas < totalCost) return -1;

        int total = 0;
        int start = 0;

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
        System.out.println(canCompleteCircle(gas, cost));
        System.out.println(canCompleteCircleI(gas, cost));
    }
}
