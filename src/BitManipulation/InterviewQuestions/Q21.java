package BitManipulation.InterviewQuestions;

import java.util.*;

public class Q21 {


    static int countTriplets(int[] arr) {

        // Time Complexity : O(n²)
        // Space Complexity : O(1)

        int n = arr.length;

        int countTriplets = 0;

        for (int i = 0; i < n - 1; i++) {

            int xor = arr[i];

            for (int j = i + 1; j < n; j++) {

                xor ^= arr[j];

                if (xor == 0) {

                    countTriplets += (j - i);
                }
            }

        }

        return countTriplets;
    }

    static int countTripletsI(int[] arr) {

        // Time Complexity : O(n)
        // Space Complexity : O(n)


        int n = arr.length;
        int prefixXor = 0;
        int countTriplets = 0;


        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> indexSum = new HashMap<>();


        freq.put(0, 1);
        indexSum.put(0, -1);

        for (int k = 0; k < n; k++) {
            prefixXor ^= arr[k];

            if (freq.containsKey(prefixXor)) {
                int count = freq.get(prefixXor);
                int sum = indexSum.get(prefixXor);


                countTriplets += count * (k - 1) - sum;
            }


            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
            indexSum.put(prefixXor, indexSum.getOrDefault(prefixXor, 0) + k);
        }

        return countTriplets;


    }

    public static void main(String[] args) {

        // leeTCode->1442

        int[] arr = {2, 3, 1, 6, 7};
        System.out.println(countTriplets(arr));
        System.out.println(countTripletsI(arr));

    }
}
