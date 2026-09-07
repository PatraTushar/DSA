package DSAPractice;

public class Q37 {

    static int findMax(int[] piles) {

        int max = Integer.MIN_VALUE;

        for (int pile : piles) {

            max = Math.max(max, pile);
        }

        return max;
    }

    static int findTotalHrs(int[] piles, int target) {

        int hrs = 0;

        for (int pile : piles) {

            hrs += Math.ceil((double) pile / target);
        }

        return hrs;

    }

    static int minEatingSpeed(int[] piles, int hrs) {

        int low = 1;
        int high = findMax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int hrsTaken = findTotalHrs(piles, mid);

            if (hrsTaken > hrs) low = mid + 1;
            else high = mid - 1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int hrs = 8;
        System.out.println(minEatingSpeed(piles, hrs));
    }
}
