package ARRAYS.binarySearchPattern;

public class Q24 {



    static int getMaxWeight(int[] weights) {

        int max = Integer.MIN_VALUE;

        for (int ele : weights) {

            if (ele > max) {

                max = ele;
            }


        }

        return max;
    }

    static int getTotalWeight(int[] weights) {

        int sum = 0;

        for (int ele : weights) {

            sum += ele;
        }

        return sum;
    }


    static int countDays(int[] weights, int mid) {

        int initialWeight = 0;
        int possibleDays = 1;

        for (int weight : weights) {

            if (initialWeight + weight <= mid) {

                initialWeight += weight;

            } else {

                possibleDays++;
                initialWeight = weight;

            }
        }

        return possibleDays;
    }

    static int minCapacityToShip(int[] weights, int days) {

        // Time Complexity: O(n.log(sum-max))
        // Space Complexity: O(1)

        if (days > weights.length) return -1;

        int low = getMaxWeight(weights);
        int high = getTotalWeight(weights);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int daysPossible = countDays(weights, mid);

            if (daysPossible > days) {

                low = mid + 1;
            } else high = mid - 1;

        }

        return low;
    }
    public static void main(String[] args) {

        // least capacity to ship packages within d days (leeTCode-->1011)

        int[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(minCapacityToShip(weight, days));

    }
}
