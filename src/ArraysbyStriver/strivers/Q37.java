package ArraysbyStriver.strivers;



public class Q37 {

    static int maxProfit(int[] prices) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = prices.length;
        int minimal = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            int cost = prices[i] - minimal;
            maxProfit = Math.max(cost, maxProfit);
            minimal = Math.min(minimal, prices[i]);


        }

        return maxProfit;
    }

    public static void main(String[] args) {

        // leeTCode->121

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));

    }
}
