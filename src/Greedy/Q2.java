package Greedy;

import java.util.Arrays;

public class Q2 {

    static int numRescueBoats(int[] people, int limit) {

        //  Time Complexity: O(n log n)  O(n)
        //  Space Complexity: O(1)

        Arrays.sort(people);

        int n = people.length;
        int minBoats = 0;
        int currWeight = 0;

        int i = 0;
        int j = n - 1;


        while (i <= j) {

            currWeight = people[i] + people[j];

            if (currWeight <= limit) {

                minBoats++;
                i++;
                j--;
            } else {

                minBoats++;
                j--;
            }
        }

        return minBoats;


    }

    public static void main(String[] args) {

        // leeTCode->881

        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));


    }
}
