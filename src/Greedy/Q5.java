package Greedy;

public class Q5 {

    static int minCost(String colors, int[] neededTime) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = colors.length();
        int minimumTime = 0;
        int maxTimeInGroup = neededTime[0];

        for (int i = 1; i < n; i++) {

            if (colors.charAt(i) == colors.charAt(i - 1)) {

                minimumTime += Math.min(maxTimeInGroup, neededTime[i]);
                maxTimeInGroup = Math.max(maxTimeInGroup, neededTime[i]);


            } else {

                maxTimeInGroup = neededTime[i];
            }


        }

        return minimumTime;


    }


    public static void main(String[] args) {

        // leeTCode->1578

        String colors = "abaac";
        int[] needTime = {1, 2, 3, 4, 5};
        System.out.println(minCost(colors, needTime));


    }
}
