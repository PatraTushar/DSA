package SlidingWindow.InterviewQuestions;

public class Q35 {

    static long maxProfit(int[] prices, int[] strategy, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int n = prices.length;

        long actualProfit = 0;
        long[] profit = new long[n];


        // original profit

        for (int i = 0; i < n; i++) {

            profit[i] = (long) strategy[i] * prices[i];
            actualProfit += profit[i];
        }


        long originalWindowProfit = 0;
        long modifiedWindowProfit = 0;
        long maxGain = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            // Expand the window
            originalWindowProfit += profit[right];

            // second half of the window
            if (right - left + 1 > k / 2) modifiedWindowProfit += prices[right];


            // shrink the window
            while (right - left + 1 > k) {

                originalWindowProfit -= profit[left];
                modifiedWindowProfit -= prices[left + k / 2];
                left++;
            }


            if (right - left + 1 == k) maxGain = Math.max(maxGain, modifiedWindowProfit - originalWindowProfit);


        }
        return actualProfit + maxGain;


    }

    public static void main(String[] args) {

        // leeTCode->3652

        int[] prices = {4, 2, 5};
        int[] strategy = {-1, 0, 1};
        int k = 2;

        System.out.println(maxProfit(prices, strategy, k));
    }
}
