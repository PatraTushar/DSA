package SlidingWindow.InterviewQuestions;

public class Q18 {

    static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = customers.length;
        int unsatisfiedCustomers = 0;


        // Calculate initial unsatisfied customers in the first 'minutes' window
        for (int i = 0; i < minutes; i++) {

            unsatisfiedCustomers += customers[i] * grumpy[i];

        }

        int maxUnsatisfiedCustomers = unsatisfiedCustomers;


        int left = 0;

        for (int right = minutes; right < n; right++) {

            unsatisfiedCustomers += customers[right] * grumpy[right];
            unsatisfiedCustomers -= customers[left] * grumpy[left];

            maxUnsatisfiedCustomers=Math.max(maxUnsatisfiedCustomers,unsatisfiedCustomers);

            left++;

        }

        int totalCustomers=maxUnsatisfiedCustomers;

        // Calculate total satisfied customers
        for (int k=0;k<n;k++){

            if (grumpy[k]==0) totalCustomers+=customers[k];
        }


        return totalCustomers;


    }

    public static void main(String[] args) {

        // leeTCode->1052

        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;

        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
}
