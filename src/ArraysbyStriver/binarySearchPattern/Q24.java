package ArraysbyStriver.binarySearchPattern;

public class Q24 {



    static int findMax(int[] weights) {

        int max = Integer.MIN_VALUE;

        for (int ele : weights) {

            if (ele > max) {

                max = ele;
            }


        }

        return max;
    }

    static int findSum(int[] weights) {

        int sum = 0;

        for (int ele : weights) {

            sum += ele;
        }

        return sum;
    }


    static int calculateDays(int[] weights, int mid) {

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

    static int shipWithInDDays(int[] weights, int days) {

        // Time Complexity: O(n.log(sum-max))
        // Space Complexity: O(1)

        if (days > weights.length) return -1;

        int start = findMax(weights);
        int end = findSum(weights);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int daysPossible = calculateDays(weights, mid);

            if (daysPossible > days) {

                start = mid + 1;
            } else end = mid - 1;

        }

        return start;
    }
    public static void main(String[] args) {

        // least capacity to ship packages within d days (leeTCode-->1011)

        int[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(shipWithInDDays(weight, days));

    }
}
