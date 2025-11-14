package Greedy;

import java.util.Arrays;

public class Q32 {

    static long maximumHappinessSum(int[] happiness, int k) {

        //  Time Complexity: O(n log n) + O(n)=O(n log n)
        //  Space Complexity: O(1)


        int n = happiness.length;

        Arrays.sort(happiness);


        int i = n - 1;
        int decrement = 0;
        long selectedChildren = 0;

        while (i >= 0 && k > 0) {


            if (happiness[i] - decrement < 0) selectedChildren += 0;

            else selectedChildren += happiness[i] - decrement;

            decrement++;
            i--;
            k--;


        }

        return selectedChildren;
    }

    public static void main(String[] args) {

        // leeTCode->3075

        int[] happiness = {1, 2, 3};
        int k = 2;
        System.out.println(maximumHappinessSum(happiness, k));
    }
}
