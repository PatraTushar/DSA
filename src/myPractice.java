import java.util.Arrays;

public class myPractice {


    static int getMaxPiles(int[] piles) {

        int maxPiles = Integer.MIN_VALUE;

        for (int pile : piles) {

            maxPiles = Math.max(maxPiles, pile);
        }

        return maxPiles;
    }

    static int calculateHrs(int[] piles, int banana) {

        int totalHrs = 0;

        for (int i = 0; i < piles.length; i++) {

            totalHrs += Math.ceil((double) piles[i] / banana);
        }

        return totalHrs;


    }

    static int minEatingSpeed(int[] piles, int hrs) {

        int low = 1;
        int high = getMaxPiles(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int hoursTaken = calculateHrs(piles, mid);

            if (hoursTaken > hrs) low = mid + 1;

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




