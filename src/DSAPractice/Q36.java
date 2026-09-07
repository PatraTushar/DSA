package DSAPractice;

public class Q36 {

    static int findMax(int[] weights) {

        int max = Integer.MIN_VALUE;

        for (int weight : weights) {

            max = Math.max(max, weight);

        }

        return max;
    }


    static int findSum(int[] weights) {

        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        return sum;
    }

    static int countDays(int[] weights, int target) {

        int days = 1;
        int gainedWeight = 0;


        for (int weight : weights) {

            gainedWeight += weight;

            if (gainedWeight > target) {

                days++;
                gainedWeight = weight;
            }

        }

        return days;

    }

    static int minCapacityToShip(int[] weights, int days) {

        int low = findMax(weights);
        int high = findSum(weights);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int totalDays = countDays(weights, mid);

            if (totalDays > days) low = mid + 1;
            else high = mid - 1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(minCapacityToShip(weight, days));
    }
}
