package DSAPractice;

public class Q70 {

    static int maxProfit(int[] prices) {

        int n = prices.length;
        int pastMin = Integer.MAX_VALUE;
        int maxProfit = 0;


        for (int i = 0; i < n; i++) {

            pastMin = Math.min(pastMin, prices[i]);
            int profit = prices[i] - pastMin;
            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));

    }
}
