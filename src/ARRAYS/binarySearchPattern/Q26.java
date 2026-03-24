package ARRAYS.binarySearchPattern;

public class Q26 {

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {

                max = ele;
            }

        }

        return max;
    }


    static int calculateHours(int[] piles, int mid) {

        int totalHrs = 0;

        for (int ele : piles) {

            totalHrs += Math.ceil((double) ele / mid);
        }

        return totalHrs;
    }


    static int minEatingSpeed(int[] piles, int hrs) {

        // Time Complexity: O(n.log(max(piles)-1))
        // Space Complexity: O(1)


        int low = 1;
        int high = findMax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int hrsTaken = calculateHours(piles, mid);

            if (hrsTaken > hrs) {

                low = mid + 1;
            } else high = mid - 1;


        }

        return low;
    }

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int hrs = 8;
        System.out.println(minEatingSpeed(piles, hrs));

    }
}
